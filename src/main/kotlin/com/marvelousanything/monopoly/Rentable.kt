package com.marvelousanything.monopoly

interface Rentable : Ownable {
    val rent: Int
    fun chargeRent(player: Player) = player.chargeBalance(rent)
}