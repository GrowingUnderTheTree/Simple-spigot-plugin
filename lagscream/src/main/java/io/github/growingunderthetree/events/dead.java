package io.github.growingunderthetree.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class dead implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent xd) {
        double x = xd.getEntity().getLocation().getX();
        double z = xd.getEntity().getLocation().getZ();
                xd.setDeathMessage(ChatColor.RED+"Someone died XD"+ ChatColor.GOLD+"death coord here: "+"X: "+x+"Z: "+z);
    }
}
