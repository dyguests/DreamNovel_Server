package com.fanhl.dreamnovel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 主控件器
 *
 * @author fanhl
 */
@Controller
public class MainController {
    /**
     * 首页
     *
     * @return 首页
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("Title", "你好 SpringMVC");
        modelMap.put("END", "你好 SpringMVC!");
        return "index";
    }
}
