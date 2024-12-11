package ru.anura.data

import de.jensklingenberg.ktorfit.Ktorfit
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

object ApiFactory {

    private const val BASE_URL = "https://cyberprot.ru/shopping/v2/"

    val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(
                Json {
                    isLenient = true
                    ignoreUnknownKeys = true
                }
            ) // Использует kotlinx.serialization для сериализации/десериализации JSON
        }
    }

    fun createApiClient(): Ktorfit {
        return Ktorfit.Builder()
            .baseUrl(BASE_URL)
            .httpClient(httpClient)
            .build()
    }

}