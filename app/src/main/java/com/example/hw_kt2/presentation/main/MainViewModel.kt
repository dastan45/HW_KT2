package com.example.hw_kt2.presentation.main

import androidx.lifecycle.ViewModel
import com.example.hw_kt2.data.ShopListRepositoryImpl
import com.example.hw_kt2.domain.*

class MainViewModel : ViewModel(){

    private val repository = ShopListRepositoryImpl

    private val addShopItemUseCase = AddShopItemUseCase(repository)

    private val getShopItemUseCase = GetShopItemUseCase(repository)

    private val getShopItemListUseCase = GetShopListUseCase(repository)

    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)

    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopItemListUseCase.getShopList()

    fun addShopItem(shopItem: ShopItem) {
        addShopItemUseCase.addShopItem(shopItem)
    }

    fun editShopItem(shopItem: ShopItem) {
        editShopItemUseCase.editShopItem(shopItem)
    }

//    fun getShopList() {
//        val list = getShopItemListUseCase.getShopList()
//        shopList.value = list
//    }

    fun deleteShop(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

//    fun changeEnableState(shopItem: ShopItem) {
//        val newItem = shopItem.copy(enabled = !shopItem.enabled)
//        editShopItemUseCase.editShopItem(newItem)
//    }

    fun getShopItem(shopItemId: Int): ShopItem {
        return getShopItemUseCase.getShopItem(shopItemId)
    }
}