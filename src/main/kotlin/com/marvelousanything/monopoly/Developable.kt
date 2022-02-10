package com.marvelousanything.monopoly

interface Developable : Ownable {
    var housePrice: Int
    var houses: Int

    fun buildHouse() : Boolean {
        if (owner == null || houses == 5) return false
        if (owner!!.balance) {
            houses += 1
            return true
        }
        return false
    }

    fun removeHouse() : Boolean {
        if (owner == null || houses == 0) return false
        if (owner!!.increaseBalance(housePrice)) {
            houses -= 1
            return true
        }
        return false
    }
}