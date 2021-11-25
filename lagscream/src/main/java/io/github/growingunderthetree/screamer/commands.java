package io.github.growingunderthetree.screamer;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class commands implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack iron = new ItemStack(Material.IRON_INGOT);
            ItemStack wood = new ItemStack(Material.ACACIA_WOOD);
            iron.setAmount(32);
            wood.setAmount(16);
            player.getInventory().addItem(iron, wood);
        }
        return true;
    }
}