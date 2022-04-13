package com.example.hw_kt2.domain

class GetShopListUseCase (private val shopListRepository: ShopListRepository) {

    fun getShopList() = shopListRepository.getShopList()

}