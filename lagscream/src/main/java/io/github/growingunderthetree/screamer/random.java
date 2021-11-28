package io.github.growingunderthetree.screamer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class random implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack iron = new ItemStack(Material.IRON_INGOT,32);
            ItemStack wood = new ItemStack(Material.ACACIA_WOOD,64);
            ItemStack diamond = new ItemStack(Material.DIAMOND_BLOCK,2);
            ItemStack wow = new ItemStack(Material.NETHERITE_CHESTPLATE,1);
            ItemStack lucky = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 4);
            int randomNum = (int)(Math.random() * 5);
            switch (randomNum) {
                case 0:
                    player.getInventory().addItem(diamond);
                case 1:
                    player.getInventory().addItem(diamond);
                case 2:
                    player.getInventory().addItem(diamond);
                case 3:
                    player.getInventory().addItem(diamond);
                case 4:
                    player.getInventory().addItem(diamond);
                case 5:
                    player.getInventory().addItem(lucky, diamond);
                    Bukkit.getServer().broadcastMessage(ChatColor.BLUE + "someone got a lucky day!");
            }
        }
        return true;
    }
}
