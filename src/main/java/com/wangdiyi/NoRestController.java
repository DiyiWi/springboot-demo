package com.wangdiyi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by uas on 2017/5/24.
 */
@Controller
public class NoRestController {
    @GetMapping("/index")
    public String aa(){
        return "index";
    }
}
