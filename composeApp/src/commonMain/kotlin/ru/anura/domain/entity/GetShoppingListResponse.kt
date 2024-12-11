package ru.anura.domain.entity

import kotlinx.serialization.SerialName

data class GetShoppingListResponse (
    val success: Boolean,
    @SerialName("item_list") val itemList: List<ShoppingItem>
)