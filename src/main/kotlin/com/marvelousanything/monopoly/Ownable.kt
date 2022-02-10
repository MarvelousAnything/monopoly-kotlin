package com.marvelousanything.monopoly

interface Ownable {
    var owner: PropertyOwner

    fun transferOwnership(recipient: PropertyOwner) : Boolean {
        owner = recipient
        return true
    }
}