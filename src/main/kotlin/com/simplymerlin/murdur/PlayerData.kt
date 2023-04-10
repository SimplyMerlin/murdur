package com.simplymerlin.murdur

import org.bukkit.entity.Player

data class PlayerData(
    var role: Role = Role.INNOCENT,
    var gold: Int = 0,
)

fun Player.printFunctionType(i: Int) { println("Extension function #$i") }

val Player.playerData
    get() = Murdur.murdur.currentGame.players[this]