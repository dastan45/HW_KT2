package com.example.hw_kt2.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem (shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}