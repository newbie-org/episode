package com.example.episode

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EpisodeApplication

fun main(args: Array<String>) {
    runApplication<EpisodeApplication>(*args)
}
