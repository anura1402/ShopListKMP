package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class AddProductToListUseCase(private val repository: ShoppingListRepository) {
    operator fun invoke(listId: Int, name: String, count:Int) = repository.addProductToList(listId, name, count)
}