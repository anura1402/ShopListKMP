package ru.anura.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.anura.domain.Product

@Composable
fun ShopList() {
    val productList = getItemList()
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(productList){ product ->
            ProductRow(product = product)
        }
    }
}
@Composable
fun ProductRow(product: Product) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp), // Отступы между карточками
        elevation = 4.dp // Тень карточки
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = product.name, style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = product.created, style = MaterialTheme.typography.body2)
        }
    }
}

fun getItemList(): List<Product> {
    return List(20) { // создаём 20 элементов
        Product(id = it, name = "Item #$it", created = "date for #$it")
    }
}