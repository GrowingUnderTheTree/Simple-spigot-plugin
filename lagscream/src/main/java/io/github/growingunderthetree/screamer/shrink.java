package io.github.growingunderthetree.screamer;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class shrink implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Player TargetPlayer = player.getServer().getPlayer(args[0]);
            World world = TargetPlayer.getWorld();
            int heart = 10;
            if(command.getName().equalsIgnoreCase("broadcast")){
                if(args.length < 2){
                    player.sendMessage("/shrink <user> <1,2,3,4,5>");
                }else if(args.length > 2){
                    player.sendMessage("/shrink <user> <1,2,3,4,5>");
                }else{
                    switch (heart) {
                        case 1:
                            player.setHealth(3);
                        case 2:
                            player.setHealth(6);
                        case 3:
                            player.setHealth(9);
                        case 4:
                            player.setHealth(12);
                        case 5:
                            player.setHealth(15);
                    }

                }
            }
        }
        return false;
    }
}
