package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class CrossProductOffUseCase (private val repository: ShoppingListRepository) {
    operator fun invoke(itemId: String) = repository.crossProductOff(itemId)
}