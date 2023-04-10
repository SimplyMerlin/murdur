package com.simplymerlin.murdur

import com.simplymerlin.fsmchamp.State
import net.kyori.adventure.text.Component
import org.bukkit.Bukkit

class PrePhase(val game: Game) : State() {

    override var time = 10

    override fun onStart() {

    }

    override fun onEnd() {

    }

    override fun onUpdate() {
        Bukkit.broadcast(Component.text(time))
    }

}