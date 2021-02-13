package siege.gambling;

import org.bukkit.plugin.java.JavaPlugin;
import siege.gambling.Utilities.VaultHook;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        (new VaultHook()).createHooks();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
