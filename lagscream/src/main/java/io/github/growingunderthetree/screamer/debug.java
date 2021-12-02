package io.github.growingunderthetree.screamer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class debug implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("|++++++++++++++++++++++++++++++++++++++++|");
            player.sendMessage("|LagScream plugin is working perfect now!|");
            player.sendMessage("|++++++++++++++++++++++++++++++++++++++++|");
        }
        return true;
    }
}
