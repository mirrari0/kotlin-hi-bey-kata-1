package com.hibey

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class HiBeyKataServer {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(HiBeyKataServer::class.java, *args)
        }
    }
}