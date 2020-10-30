package com.atguigu.springcloud.filter;

import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 *
 * @author PaulFang
 * @date 2020/10/29
 */
@Component
@Slf4j
public class GateWayFileter implements GlobalFilter,Ordered{

    @Override
    public Mono<Void> filter(ServerWebExchange serverWebExchange, GatewayFilterChain gatewayFilterChain) {

        log.info("——come in GateWayFileter——,date={}", new Date());
        String uname = serverWebExchange.getRequest().getQueryParams().getFirst("uname");
        if (StringUtils.isEmpty(uname)){
            log.info(" 非法用户!");
            serverWebExchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return serverWebExchange.getResponse().setComplete();
        }
        return gatewayFilterChain.filter(serverWebExchange);
    }

    @Override
    public int getOrder() {
        //加载这个filter 优先级
        return 0;
    }
}
