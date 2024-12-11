package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class GetAllMyShopListsUseCase (private val repository: ShoppingListRepository) {
    operator fun invoke(key: String) = repository.getAllMyShopLists(key)
}