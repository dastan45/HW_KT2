package com.example.hw_kt2.domain

class GetShopItemUseCase (private val repository: ShopListRepository) {

    fun getShopItem(shopItemId: Int) = repository.getShopItem(shopItemId)}