package io.github.growingunderthetree.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class fall implements Listener {

    @EventHandler
    void onRiding(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        float distance = player.getFallDistance();
        player.sendMessage("You are falling!\n amounts of blocks you falled:" + distance);
    }
}
