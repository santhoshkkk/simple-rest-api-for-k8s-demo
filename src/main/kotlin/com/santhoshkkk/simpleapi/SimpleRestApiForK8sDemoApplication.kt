package com.santhoshkkk.simpleapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleRestApiForK8sDemoApplication

fun main(args: Array<String>) {
	runApplication<SimpleRestApiForK8sDemoApplication>(*args)
}
