package com.example.hw_kt2.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopList(): LiveData<List<ShopItem>>

    fun editShopList(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem





}