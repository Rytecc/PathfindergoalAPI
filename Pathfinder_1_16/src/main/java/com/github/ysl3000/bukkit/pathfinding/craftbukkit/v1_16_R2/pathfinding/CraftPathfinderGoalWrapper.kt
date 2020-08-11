package com.github.ysl3000.bukkit.pathfinding.craftbukkit.v1_16_R2.pathfinding

import net.minecraft.server.v1_16_R2.PathfinderGoal

class CraftPathfinderGoalWrapper(
        private val pathfinderGoal: com.github.ysl3000.bukkit.pathfinding.pathfinding.PathfinderGoal) : PathfinderGoal() {

    override fun a() = pathfinderGoal.shouldExecute()

    override fun b() = pathfinderGoal.canContinueToUse()

    override fun c() = pathfinderGoal.init()

    override fun d() = pathfinderGoal.reset()

    override fun e() = pathfinderGoal.execute()
}