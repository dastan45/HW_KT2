package com.example.hw_kt2.domain

class EditShopItemUseCase(private val repository: ShopListRepository)  {

    fun editShopItem(shopItem: ShopItem){
        repository.editShopList(shopItem)
    }
}