package org.livedev.crest

import org.livedev.crest.domain.Organisation

fun main() {
    val acf = Organisation("SO.ACF", "Action Against Hunger")
    println("hello from kt ${acf.code},${acf.name} - ${acf.display}")
}