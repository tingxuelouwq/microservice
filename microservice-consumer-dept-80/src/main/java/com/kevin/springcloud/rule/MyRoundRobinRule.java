package com.kevin.springcloud.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 类名: MyRandomRule<br/>
 * 包名：com.kevin.springcloud.rule<br/>
 * 作者：kevin<br/>
 * 时间：2019/5/30 18:56<br/>
 * 版本：1.0<br/>
 * 描述：
 */
public class MyRoundRobinRule extends AbstractLoadBalancerRule {

    private int totalCounter = 3;
    private int currentIndex = 0;
    private int currentCounter = 0;

    private static Logger log = LoggerFactory.getLogger(RoundRobinRule.class);

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            log.warn("no load balancer");
            return null;
        }

        Server server = null;
        int count = 0;
        while (server == null && count++ < 10) {
            List<Server> reachableServers = lb.getReachableServers();
            List<Server> allServers = lb.getAllServers();
            int upCount = reachableServers.size();
            int serverCount = allServers.size();

            if ((upCount == 0) || (serverCount == 0)) {
                log.warn("No up servers available from load balancer: " + lb);
                return null;
            }

            if (currentCounter < totalCounter) {
                server = reachableServers.get(currentIndex);
                currentCounter++;
            } else {
                currentCounter = 0;
                currentIndex++;
                if (currentIndex >= upCount) {
                    currentIndex = 0;
                }
            }

            if (server == null) {
                /* Transient. */
                Thread.yield();
                continue;
            }

            if (server.isAlive() && (server.isReadyToServe())) {
                return (server);
            }

            // Next.
            server = null;
        }

        if (count >= 10) {
            log.warn("No available alive servers after 10 tries from load balancer: "
                    + lb);
        }
        return server;
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}