package com.test.testforserj.models

/** Created by Sergei Kolinichenko on 10.06.2023 at 17:46 (GMT+3) **/

data class BasketDish(
    val id: Int,
    val name: String,
    val price: Int,
    val weight: Int,
    val image_url: String,
    val quantity: Int
)
