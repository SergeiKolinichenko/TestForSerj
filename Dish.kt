package com.test.testforserj.models

/** Created by Sergei Kolinichenko on 08.06.2023 at 20:05 (GMT+3) **/

data class Dish(
    val id: Int,
    val name: String,
    val price: Int,
    val weight: Int,
    val description: String,
    val image_url: String,
    val tegs: List<String>
)
