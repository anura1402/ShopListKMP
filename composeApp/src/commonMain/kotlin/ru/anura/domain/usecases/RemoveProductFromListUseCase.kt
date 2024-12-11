package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class RemoveProductFromListUseCase(private val repository: ShoppingListRepository) {
    operator fun invoke(listId: Int, itemId: Int) = repository.removeProductFromList(listId, itemId)
}