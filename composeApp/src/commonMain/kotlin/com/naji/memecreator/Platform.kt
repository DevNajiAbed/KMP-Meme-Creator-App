package com.naji.memecreator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform