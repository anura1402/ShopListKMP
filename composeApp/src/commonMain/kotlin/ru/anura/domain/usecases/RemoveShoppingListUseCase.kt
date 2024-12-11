package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class RemoveShoppingListUseCase (private val repository: ShoppingListRepository) {
    operator fun invoke(listId: Int, key: String) = repository.removeShoppingList(listId,key )
}