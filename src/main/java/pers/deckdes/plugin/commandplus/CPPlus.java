package pers.deckdes.plugin.commandplus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CPPlus implements CommandExecutor {
    public final CommandPlus plugin;

    public CPPlus(CommandPlus plugin){
        this.plugin=plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("cp")){
            if (!(sender instanceof Player)){
                sender.sendMessage(ChatColor.BLUE+"[CommandPlus]:只能是玩家输入这个指令！");
                return false;

        }else {

                if (args.length==0){
                    Player player = (Player) sender;
                    player.sendMessage(ChatColor.DARK_AQUA + "[CommandPlus]:/cp help来显示帮助");
                    //DEEP DARK FANTASY

                    return true;
                }
                if (args[0].equalsIgnoreCase("help")) {
                    Player player = (Player) sender;
                    player.sendMessage(ChatColor.YELLOW + "+----------[CommandPlus]-----------+");
                    player.sendMessage(ChatColor.YELLOW + "|             /cp open      开启插件            |");
                    player.sendMessage(ChatColor.YELLOW + "|             /cp close     关闭插件            |");
                    player.sendMessage(ChatColor.YELLOW + "+----------[CommandPlus]-----------+");
                }

                if (args[0].equalsIgnoreCase("open")) {
                    CPevent.a = true;
                    Bukkit.broadcastMessage(ChatColor.RED + "[CommandPlus]:好耶，插件开启了");
                }
                if(args[0].equalsIgnoreCase("close")){
                    CPevent.a = false;
                    Bukkit.broadcastMessage(ChatColor.RED+"[CommandPlus]:这好吗？这不好，插件关闭了");
                      }
                return true;
                }
            }
        return true;
        }
    }


