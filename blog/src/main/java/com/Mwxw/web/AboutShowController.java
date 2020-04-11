package com.Mwxw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-02-05
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
