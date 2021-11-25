package io.github.growingunderthetree.screamer;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.TimeUnit;

public final class Screamer extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().broadcastMessage("LagScreamer, a great server plugin for broadcasting and clear lag!");
        System.out.println("plugin started \n go GrowingUnderTheTree.github.io and support him");
        this.getCommand("kit").setExecutor(new commands());
        this.getCommand("broadcast").setExecutor(new broadcast());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        Bukkit.getServer().broadcastMessage("Goodbye guys! LagScreamer is going offline!");
        System.out.println("Plugin is going offline");
        // Plugin shutdown logic
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) throws InterruptedException {
        int rest = 300;
        if (e.getItemDrop().getItemStack().getType().equals(Material.GRAVEL)) {
            TimeUnit.SECONDS.sleep(rest);
            switch (rest) {
                case 60:
                    Bukkit.getServer().broadcastMessage("掉落物即将清除！");
            }
            e.getItemDrop().remove();
        } else if (e.getItemDrop().getItemStack().getType().equals(Material.DIRT)) {
            TimeUnit.SECONDS.sleep(rest);
            switch (rest) {
                case 60:
                    Bukkit.getServer().broadcastMessage("掉落物即将清除！");
            }
            e.getItemDrop().remove();
        } else if (e.getItemDrop().getItemStack().getType().equals(Material.ROTTEN_FLESH)) {
            TimeUnit.SECONDS.sleep(rest);
            switch (rest) {
                case 60:
                    Bukkit.getServer().broadcastMessage("掉落物即将清除！");
            }
            e.getItemDrop().remove();
        } else if (e.getItemDrop().getItemStack().getType().equals(Material.FEATHER)) {
            TimeUnit.SECONDS.sleep(rest);
            switch (rest) {
                case 60:
                    Bukkit.getServer().broadcastMessage("掉落物即将清除！");
            }
            e.getItemDrop().remove();
        } else if (e.getItemDrop().getItemStack().getType().equals(Material.SAND)) {
            TimeUnit.SECONDS.sleep(rest);
            switch (rest) {
                case 60:
                    Bukkit.getServer().broadcastMessage("掉落物即将清除！");
            }
            e.getItemDrop().remove();
        } else if (e.getItemDrop().getItemStack().getType().equals(Material.SOUL_SAND)) {
            TimeUnit.SECONDS.sleep(rest);
            switch (rest) {
                case 60:
                    Bukkit.getServer().broadcastMessage("掉落物即将清除！");
            }
            e.getItemDrop().remove();
        }
    }
}
