package ru.anura

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform