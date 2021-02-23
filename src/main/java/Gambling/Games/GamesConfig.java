package Gambling.Games;

import Gambling.Core;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import Gambling.Utilities.Utils;

import java.io.File;

public class GamesConfig {
    private final Core plugin;
    private final String prefix;
    private FileConfiguration settings;
    private File configFile;

    public boolean CoinFlip;
    public boolean WhackAMole;
    public boolean Cups;
    public boolean Dice;

    public GamesConfig(Core plugin) {
        this.plugin = plugin;
        this.prefix = "&7[&2Siege&aGambling&7] "; //temp prefix used before lang.yml loads
        loadDefaultSettings();
    }

    private void loadDefaultSettings() {
        if (configFile == null) {
            configFile = new File(plugin.getDataFolder(), "config.yml");
        }
        if (!configFile.exists()) {
            plugin.saveResource("config.yml", false);
            settings = YamlConfiguration.loadConfiguration(configFile);
            Utils.sendColoredConsoleMsg(prefix + "new config.yml created");
        } else {
            settings = YamlConfiguration.loadConfiguration(configFile);
        }
//        matchConfig(settings, configFile);
        loadSettings();
        Utils.sendColoredConsoleMsg(prefix + "&7config.yml &aloaded");
    }

    // Used to update config
/*    @SuppressWarnings("ConstantConditions")
    private void matchConfig(FileConfiguration config, File file) {
        try {
            boolean hasUpdated = false;
            InputStream is = plugin.getResource(file.getName());
            assert is != null;
            InputStreamReader isr = new InputStreamReader(is);
            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(isr);
            for (String key : defConfig.getConfigurationSection("").getKeys(true)) {
                if (!config.contains(key)) {
                    config.set(key, defConfig.get(key));
                    hasUpdated = true;
                }
            }
            for (String key : config.getConfigurationSection("").getKeys(true)) {
                if (!defConfig.contains(key) && !key.equalsIgnoreCase("recipe-delay")) {
                    config.set(key, null);
                    hasUpdated = true;
                }
            }
            if (hasUpdated)
                config.save(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    private void loadSettings() {
        this.CoinFlip = settings.getBoolean("CoinFlip");
        this.WhackAMole = settings.getBoolean("WhackAMole");
        this.Cups = settings.getBoolean("Cups");
        this.Dice = settings.getBoolean("Dice");
    }
}