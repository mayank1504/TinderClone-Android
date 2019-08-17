package com.codingblocks.tinder.fragments

data class User(
    val name: String,
    val dob: String,
    val email: String,
    val university: String,
    val photos: ArrayList<String>,
    val show_gender: Boolean = false,
    val show_orientation: Boolean = false
) {
    constructor() : this(
        "", "", "", "", arrayListOf<String>(),
        false, false
    )
}
