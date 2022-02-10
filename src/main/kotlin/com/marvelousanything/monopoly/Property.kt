package com.marvelousanything.monopoly

import java.awt.Color

class Property(override var name: String,
               override var price: Int,
               color: Color,
               var rentArray: IntArray,
               monopolyGroup: Array<Property>,
               override var housePrice: Int) : Tile, Purchasable, Tradable, Rentable, Developable {

    override var type: TileType = TileType.PROPERTY
    override var owner: Player? = null
    override var houses: Int = 0
    override val rent: Int
        get() = rentArray[houses]

    init {
        require(rentArray.size == 6) {
            "Properties should have six rent values. One for each permutation of a maximum of five houses."
        }
    }
}