package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class GetShoppingListUseCase(private val repository: ShoppingListRepository) {
    operator fun invoke(listId: String) = repository.getShoppingList(listId)
}