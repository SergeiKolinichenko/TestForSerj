package com.test.testforserj.models

/** Created by Sergei Kolinichenko on 10.06.2023 at 17:46 (GMT+3) **/

data class CartDish(
    val id: Int,
    val name: String,
    val price: Int,
    val weight: Int,
    val image_url: String,
    val quantity: Int
): ListItems {
    override val itemId: Int = id
}
