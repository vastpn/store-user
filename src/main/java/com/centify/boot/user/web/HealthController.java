package com.centify.boot.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * <b>TODO</b>
 * <b>Describe:TODO</b>
 *
 * <b>Author: tanlin [2020/9/14 14:54]</b>
 * <b>Copyright:</b> Copyright 2008-2026 http://www.jinvovo.com Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   Ver   Date                  Author           Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2020/9/14 14:54        tanlin            new file.
 * <pre>
 */
@RestController
@RequestMapping
public class HealthController {

    @GetMapping("/health")
    public Map<String,Object> getHealthInfo(){
        Map<String,Object> result = new HashMap<>(1);
        result.put("status","success");
        return result;
    }
}
