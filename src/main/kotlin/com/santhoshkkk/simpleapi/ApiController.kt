package com.santhoshkkk.simpleapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    @GetMapping
    fun get() = "Welcome to kubernetes"

}