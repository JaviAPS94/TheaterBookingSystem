package com.javiaps94.theater.control

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController {

    @RequestMapping("helloWorld")
    fun helloWorld() : ModelAndView = ModelAndView("helloWorld")
}


class CheckAvailabilityBackingBean() {
    val seatNums = 1..36
    val seatRows = 'A'..'O'
    val selectedSeatNum : Int = 1
    val selectedSeatRow : Char = 'A'
    val result : String = ""
}