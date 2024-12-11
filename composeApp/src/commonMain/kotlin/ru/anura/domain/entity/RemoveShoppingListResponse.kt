package ru.anura.domain.entity

import kotlinx.serialization.SerialName

data class RemoveShoppingListResponse(
    val success: Boolean,
    @SerialName("new_value") val newValue: Boolean // true - удалено, false - восстановлено
)
