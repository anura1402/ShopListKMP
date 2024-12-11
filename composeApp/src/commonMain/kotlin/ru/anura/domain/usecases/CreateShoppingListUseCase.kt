package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class CreateShoppingListUseCase (private val repository: ShoppingListRepository) {
    operator fun invoke(key: String, name: String) = repository.createShoppingList(key, name)
}