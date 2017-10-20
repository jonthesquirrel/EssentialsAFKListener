package io.github.jonthesquirrel.essentialsafklistener;

import net.ess3.api.events.AfkStatusChangeEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.List;

class EssentialsAFKListener extends Main implements Listener {
    private List<String> commands = getConfig().getStringList("commands");
    @EventHandler
    public void onAfkStatusChangeEvent(AfkStatusChangeEvent e) {
        for(String command : commands) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
        }
    }
}
