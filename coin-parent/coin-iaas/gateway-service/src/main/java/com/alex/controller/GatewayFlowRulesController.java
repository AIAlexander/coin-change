package com.alex.controller;

import com.alibaba.csp.sentinel.adapter.gateway.common.api.ApiDefinition;
import com.alibaba.csp.sentinel.adapter.gateway.common.api.GatewayApiDefinitionManager;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayFlowRule;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayRuleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author wsh
 * @date 2021-10-30
 */
@RestController
public class GatewayFlowRulesController {

    /**
     * 获取当前sentinel配置的流控规则
     * @return
     */
    @GetMapping("/gw/flow/rules")
    public Set<GatewayFlowRule> currentGatewayFlowRules() {
        return GatewayRuleManager.getRules();
    }

    /**
     * 获取当前的api分组
     * @return
     */
    @GetMapping("/gw/api/groups")
    public Set<ApiDefinition> getApiGroups() {
        return GatewayApiDefinitionManager.getApiDefinitions();
    }
}
