package com.hmomeni.androidnavigationsample.nav

class NavEvent(
    val destination: Destination
) {
    enum class Destination {
        ONE, TWO, THREE, FOUR
    }
}