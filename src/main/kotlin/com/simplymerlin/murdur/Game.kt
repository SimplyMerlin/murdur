package com.simplymerlin.murdur

import org.bukkit.Bukkit
import org.bukkit.entity.Player

class Game(val murdur: Murdur) : ScheduledStateSeries(murdur, 20) {

    val players = mutableMapOf<Player, PlayerData>()
    val spectators = mutableSetOf<Player>()

    init {
        states.addAll(listOf(
            PlayPhase(this),
        ))
    }

    override fun onStart() {
        Bukkit.getOnlinePlayers().forEach {
            players[it] = PlayerData()
        }
        super.onStart()
    }

    override fun onEnd() {
        super.onEnd()
        players.clear()
        spectators.clear()
    }

}