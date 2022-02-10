package com.marvelousanything.monopoly

import kotlin.math.pow

class Railroad(override var name: String, override var price: Int) : Tile, Purchasable, Tradable, Rentable {
    override var type: TileType = TileType.RAILROAD
    override var owner: Player? = null
    private val baseRent: Int = 25
    override val rent: Int
        get() = baseRent * (2.0.pow(owner!!.railroadsOwned).toInt())
}