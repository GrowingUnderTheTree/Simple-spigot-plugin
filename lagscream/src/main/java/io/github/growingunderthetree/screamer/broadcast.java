package io.github.growingunderthetree.screamer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;

public class broadcast implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(command.getName().equalsIgnoreCase("broadcast")){
                if(args.length < 2){
                    player.sendMessage(ChatColor.RED + "/broadcast <Stuffs>");
                }else if(args.length > 2){
                    player.sendMessage(ChatColor.RED + "/broadcast <stuffs>");
                }else{
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + args[0]);

                }
            }
                }
        return false;
    }
}