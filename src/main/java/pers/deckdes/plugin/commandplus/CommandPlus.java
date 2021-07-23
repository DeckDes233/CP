package pers.deckdes.plugin.commandplus;

import org.bukkit.plugin.java.JavaPlugin;

public final class CommandPlus extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("CP插件加载成功");
        this.getCommand("cp").setExecutor(new CPPlus(this));
        //这里之前是/vd(
        getServer().getPluginManager().registerEvents(new CPevent(),this);
        getConfig().options().copyDefaults();
    }

    @Override
    public void onDisable() {
        getLogger().info("CP插件卸载成功");

    }
}
