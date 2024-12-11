package ru.anura.domain.usecases

import ru.anura.domain.ShoppingListRepository

class AuthByKeyUseCase(private val repository: ShoppingListRepository) {
    operator fun invoke(key: String) = repository.authByKey(key)
}