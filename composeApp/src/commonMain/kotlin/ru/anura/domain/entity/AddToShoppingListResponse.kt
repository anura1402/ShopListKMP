package ru.anura.domain.entity

import kotlinx.serialization.SerialName

data class AddToShoppingListResponse (
    val success: Boolean,
    @SerialName("item_id") val itemId: Int
)