package ru.anura.domain.entity

import kotlinx.serialization.SerialName

data class GetAllMyShopListsResponse(
    @SerialName("shop_list") val shopList: List<ShoppingList>
)