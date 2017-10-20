package io.github.jonthesquirrel.essentialsafklistener;

import net.ess3.api.events.AfkStatusChangeEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class EssentialsAFKListener extends JavaPlugin implements Listener {
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
    }

    private List<String> commands = getConfig().getStringList("commands");
    @EventHandler
    public void onAfkStatusChangeEvent(AfkStatusChangeEvent event) {
        for(String command : commands) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
        }
    }
}