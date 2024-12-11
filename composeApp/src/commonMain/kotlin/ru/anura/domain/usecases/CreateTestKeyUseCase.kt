package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class CreateTestKeyUseCase (private val repository: ShoppingListRepository) {
    operator fun invoke() = repository.createTestKey()
}