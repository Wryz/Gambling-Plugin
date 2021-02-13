package siege.gambling.Utilities;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.command.CommandSender;
import siege.gambling.Core;

import java.util.regex.Matcher;

public class Utils {
    static public String tacc(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    static public String strip(String str) {
        return ChatColor.stripColor(str);
    }

    static public NamespacedKey namespacedKey(String str) {
        return new NamespacedKey(Core.getPlugin(), str);
    }

    public static void sendColoredMsg(CommandSender player, String msg) { player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg)); }

    public static void sendColoredConsoleMsg(String msg) { Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', msg)); }
}
