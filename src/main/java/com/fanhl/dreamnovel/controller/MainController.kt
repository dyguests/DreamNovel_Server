package com.fanhl.dreamnovel.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * 主控件器
 *
 * @author fanhl
 */
@Controller
class MainController {
    /**
     * 首页
     *
     * @return 首页
     */
    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    fun index(modelMap: ModelMap): String {
        modelMap["Title"] = "你好 SpringMVC3"
        modelMap["END"] = "你好 SpringMVC3!"
        return "index"
    }
}
