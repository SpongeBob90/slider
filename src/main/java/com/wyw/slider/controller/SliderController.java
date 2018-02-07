package com.wyw.slider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wyw
 * @date 2018\2\7 0007 11:52
 */
@Controller
public class SliderController {

    @GetMapping(value = "/index")
    public String slider() {
        return "html/slider.html";
    }

}
