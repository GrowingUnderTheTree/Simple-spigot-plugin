package io.github.growingunderthetree.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class join implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.BLACK+ "Welcome to the server, " + ChatColor.GOLD + player.getDisplayName());
    }
}
