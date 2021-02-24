package Gambling.Utilities;

import Gambling.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

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

    public static ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        // Set the name of the item
        meta.setDisplayName(name);

        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }

}
