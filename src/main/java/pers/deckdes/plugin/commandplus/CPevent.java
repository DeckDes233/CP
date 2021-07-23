package pers.deckdes.plugin.commandplus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class CPevent implements Listener {
    public static boolean a;
    @EventHandler
    public void WeatherChange(WeatherChangeEvent event){
        if(a){
            if(event.toWeatherState()){
                event.setCancelled(true);

                Bukkit.broadcastMessage(ChatColor.AQUA + "[CommandPlus]:oof,下雨（雪）了我放个晴");
            }else {
                Bukkit.broadcastMessage(ChatColor.AQUA + "[CommandPlus]:好耶，还是晴天");
            }
        }else{
            Bukkit.broadcastMessage(ChatColor.AQUA + "[CommandPlus]:开关已关闭，请打开后再尝试。");
        }
    }
}