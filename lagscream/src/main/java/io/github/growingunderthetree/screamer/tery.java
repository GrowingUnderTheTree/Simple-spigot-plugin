package io.github.growingunderthetree.screamer;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class tery implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack iron = new ItemStack(Material.IRON_SWORD);
            ItemStack Armour1 = new ItemStack(Material.IRON_HELMET);
            ItemStack Armour2 = new ItemStack(Material.IRON_CHESTPLATE);
            ItemStack Armour3 = new ItemStack(Material.IRON_LEGGINGS);
            ItemStack Armour4 = new ItemStack(Material.IRON_BOOTS);
        }
        return true;
}
}
