package com.marvelousanything.monopoly

/**
 * For transactions between the bank and a player. For transactions between players, use [Tradable].
 * **/
interface Purchasable : Ownable {
    var price: Int
    val purchasable: Boolean
        get() = owner == null

    fun sell(purchaser: Player) : Boolean {
//        return purchasable && purchaser.charge(price) && transferOwnership(purchaser)
        return if (purchasable && purchaser.chargeBalance(price)) {
            transferOwnership(purchaser)
        } else {
            false
        }
    }
}