package org.empreallie.sermosecum

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform