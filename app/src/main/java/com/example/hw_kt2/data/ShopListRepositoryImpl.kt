package com.example.hw_kt2.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.hw_kt2.presentation.App
import com.example.hw_kt2.domain.ShopItem
import com.example.hw_kt2.domain.ShopListRepository

object ShopListRepositoryImpl :  ShopListRepository {

    private val mapper = ShopListMapper()

    override fun addShopItem(shopItem: ShopItem) {
        App.appDatabase.shopListDao().insertShopItem(mapper.mapEntityToDBModel(shopItem))
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        App.appDatabase.shopListDao().deleteShopItem(mapper.mapEntityToDBModel(shopItem))
    }

    override fun getShopList(): LiveData<List<ShopItem>> = Transformations.map(
        App.appDatabase.shopListDao().getShopList()
    ) {
        mapper.mapListDbModelToListEntity(it)
    }

    override fun editShopList(shopItem: ShopItem) {
        App.appDatabase.shopListDao().updateShopItem(mapper.mapEntityToDBModel(shopItem))
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        val dbModel = App.appDatabase.shopListDao().getShopItem(shopItemId)
        return mapper.mapListDbModelToEntity(dbModel)
    }
}