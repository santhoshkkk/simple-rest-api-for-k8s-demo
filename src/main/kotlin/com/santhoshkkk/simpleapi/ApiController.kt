package com.santhoshkkk.simpleapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class ApiController {

    @GetMapping
    fun get() = "Hi there.Your lucky number is ${Random.nextInt()}"

}