package com.micronautkotlinapp.controller

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import jakarta.inject.Inject
import org.junit.jupiter.api.Test

@MicronautTest
class HelloWorldControllerTest {

  @Inject
  lateinit var server: EmbeddedServer

  @Inject
  @field:Client("/")
  lateinit var client: HttpClient

  @Test
  fun testHelloWorldResponse() {
    val response: String = client.toBlocking().retrieve("/hello")
    assertEquals("Hello World", response)
  }
}