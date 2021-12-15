package io.github.growingunderthetree.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class leave implements Listener {

    @EventHandler
    void onPlayerLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.DARK_GRAY+ "Goodbye, " + ChatColor.GOLD + player.getDisplayName());
    }
}
