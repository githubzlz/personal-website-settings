package com.zlz.website.setting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务健康检查接口
 *
 * @author zhulinzhong
 * @date 2022-02-21 19:29:24
 */
@RestController("/check")
public class HeathCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "health";
    }
}
