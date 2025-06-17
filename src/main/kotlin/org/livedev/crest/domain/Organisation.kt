package org.livedev.crest.domain

class Organisation(
    code: String,
    val name: String,
    display: String?=null
) {
    val code = code.lowercase();
    val display =if (display.isNullOrEmpty()) name else display
}