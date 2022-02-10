package com.marvelousanything.monopoly

class Bank : PropertyOwner, Seller, MoneyHolder {
    override var balance: Int = 10000
    override var properties: ArrayList<Ownable>
        get() = TODO("Not yet implemented")
        set(value) {}
}