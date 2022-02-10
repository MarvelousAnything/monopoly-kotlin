package com.marvelousanything.monopoly

class Player(name: String) {
    var balance = Balance
    private var properties: ArrayList<Property> = ArrayList()
    val railroadsOwned: Int
        get() = properties.count { it.type == TileType.RAILROAD }

    object Balance {
        var balance: Int = 1500

        operator fun minusAssign(amount: Int) {
            if (amount >= balance) throw BalanceException("Insufficient Funds")
            balance -= amount
        }

        operator fun plusAssign(amount: Int) {
            balance += amount
        }
    }
}