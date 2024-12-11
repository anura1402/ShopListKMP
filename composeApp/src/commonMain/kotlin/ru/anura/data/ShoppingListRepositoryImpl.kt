package ru.anura.data

import de.jensklingenberg.ktorfit.Ktorfit
import ru.anura.domain.ShoppingListRepository
import ru.anura.domain.entity.ShoppingItem
import ru.anura.domain.entity.ShoppingList

class ShoppingListRepositoryImpl(private val apiService: ApiService) : ShoppingListRepository {
    override fun createTestKey(): String {
        return apiService.createTestKey()
    }

    override fun authByKey(key: String): Boolean {
        return apiService.authByKey(key).success
    }

    override fun createShoppingList(key: String, name: String): Int {
        val response = apiService.createShoppingList(key, name)
        return if (response.success) response.listId else -1
    }

    override fun removeShoppingList(listId: Int):Boolean {
        return apiService.removeShoppingList(listId).newValue

    }

    override fun addProductToList(listId: Int, name: String, count: Int): Int {
        val response = apiService.addProductToList(listId, name, count)
        return if (response.success) response.itemId else -1
    }

    override fun removeProductFromList(listId: Int, itemId: Int) {
        apiService.removeProductFromList(listId,itemId)
    }

    override fun crossProductOff(itemId: Int) {
        apiService.crossProductOff(itemId)
    }

    override fun getAllMyShopLists(key: String):List<ShoppingList> {
        return apiService.getAllMyShopLists(key).shopList
    }

    override fun getShoppingList(listId: Int): List<ShoppingItem> {
        val response = apiService.getShoppingList(listId)
        return if (response.success) response.itemList else emptyList()
    }
}