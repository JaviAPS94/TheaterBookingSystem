package com.javiaps94.theater.control

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController {

    @RequestMapping("helloWorld")
    fun helloWorld() : ModelAndView = ModelAndView("helloWorld")
}