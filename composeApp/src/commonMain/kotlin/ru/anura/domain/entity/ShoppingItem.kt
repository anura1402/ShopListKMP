package ru.anura.domain.entity

data class ShoppingItem(
    val created: String,
    val name: String,
    val itemId: Int,
    val isCrossed: Boolean
)