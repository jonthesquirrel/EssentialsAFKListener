package io.github.jonthesquirrel.essentialsafklistener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new EssentialsAFKListener(), this);
    }
}