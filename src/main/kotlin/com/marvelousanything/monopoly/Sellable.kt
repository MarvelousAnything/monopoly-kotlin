package com.marvelousanything.monopoly

interface Sellable : Ownable {
    var price: Int
    fun sell(recipient: Buyer) {

    }
}