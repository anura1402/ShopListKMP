package ru.anura.domain

import ru.anura.domain.entity.ShoppingItem
import ru.anura.domain.entity.ShoppingList

interface ShoppingListRepository {

    fun createTestKey(): String
    fun authByKey(key: String): Boolean
    fun createShoppingList(key: String, name: String): Int
    fun removeShoppingList(listId: Int):Boolean
    fun addProductToList(listId: Int, name: String, count: Int): Int
    fun removeProductFromList(listId: Int, itemId: Int)
    fun crossProductOff(itemId: Int)
    fun getAllMyShopLists(key: String): List<ShoppingList>
    fun getShoppingList(listId: Int):List<ShoppingItem>
}