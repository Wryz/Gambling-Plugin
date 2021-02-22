package Gambling;

import org.bukkit.plugin.java.JavaPlugin;
import Gambling.Utilities.VaultHook;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        (new VaultHook()).createHooks();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Core getPlugin() {
        return Core.getPlugin(Core.class); // Method to get the plugin from other classes, so you can use Core.plugin() in other classes to get the plugin
    }
}
