package com.simplymerlin.murdur

import com.simplymerlin.fsmchamp.StateSeries
import org.bukkit.plugin.Plugin
import org.bukkit.scheduler.BukkitTask

open class ScheduledStateSeries(private val plugin: Plugin, private val interval: Long = 1) : StateSeries() {
    private lateinit var scheduledTask: BukkitTask

    override fun onStart() {
        super.onStart()
        scheduledTask = plugin.server.scheduler.runTaskTimer(plugin, Runnable{
            update()
        }, 0L, interval)
    }

    override fun onEnd() {
        super.onEnd()
        scheduledTask.cancel()
    }
}