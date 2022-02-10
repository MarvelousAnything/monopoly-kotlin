package com.marvelousanything.monopoly

interface Seller : PropertyOwner {
    fun <T : Sellable> T.sellTo(buyer: Buyer, entity: Sellable) {

    }
}