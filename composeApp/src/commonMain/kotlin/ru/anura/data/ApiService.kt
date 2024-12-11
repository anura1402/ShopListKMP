package ru.anura.data

import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query
import ru.anura.domain.entity.AddToShoppingListResponse
import ru.anura.domain.entity.BaseResponse
import ru.anura.domain.entity.CreateShoppingListResponse
import ru.anura.domain.entity.GetAllMyShopListsResponse
import ru.anura.domain.entity.GetShoppingListResponse
import ru.anura.domain.entity.RemoveShoppingListResponse

interface ApiService {

    @GET("CreateTestKey?")
    fun createTestKey(): String

    @GET("Authentication?")
    fun authByKey(@Query("key") key: String): BaseResponse

    @GET("CreateShoppingList?")
    fun createShoppingList(@Query("key") key: String, @Query("name") name: String): CreateShoppingListResponse

    @GET("RemoveShoppingList?")
    fun removeShoppingList(@Query("listId") listId: Int): RemoveShoppingListResponse

    @GET("AddToShoppingList?")
    fun addProductToList(@Query("listId") listId: Int,  name: String, count: Int): AddToShoppingListResponse

    @GET("RemoveFromList?")
    fun removeProductFromList(@Query("listId") listId: Int, @Query("itemId") itemId: Int)

    @GET("CrossItOff?")
    fun crossProductOff(@Query("itemId") itemId: Int)

    @GET("GetAllMyShopLists?")
    fun getAllMyShopLists(@Query("key") key: String): GetAllMyShopListsResponse

    @GET("GetShoppingList?")
    fun getShoppingList(@Query("listId") listId: Int): GetShoppingListResponse

}