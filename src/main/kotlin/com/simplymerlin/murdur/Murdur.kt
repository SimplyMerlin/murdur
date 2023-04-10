package com.simplymerlin.murdur

import org.bukkit.plugin.java.JavaPlugin

class Murdur : JavaPlugin() {

    var currentGame = Game(this)

    override fun onEnable() {
        murdur = this
        logger.info("literally testing")
    }

    companion object {
        lateinit var murdur: Murdur
    }

}