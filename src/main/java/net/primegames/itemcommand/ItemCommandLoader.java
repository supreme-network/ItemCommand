package net.primegames.itemcommand;

import org.bukkit.plugin.java.JavaPlugin;

public final class ItemCommand extends JavaPlugin {

    private static ItemCommand instance;

    public static ItemCommand getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
