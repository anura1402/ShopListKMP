package ru.anura.domain.entity

import kotlinx.serialization.SerialName

data class CreateShoppingListResponse(
    val success: Boolean,
    @SerialName("list_id") val listId: Int
)
