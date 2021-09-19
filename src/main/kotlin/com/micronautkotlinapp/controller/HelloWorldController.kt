package com.micronautkotlinapp.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class HelloWorldController {

  @Get(value = "/hello", produces = [MediaType.TEXT_PLAIN])
  fun index() = "Hello World"
}