package Gambling.Games;

import Gambling.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class GamesGUI {

    private final Core plugin;
    public GamesGUI(Core plugin) {
        this.plugin = plugin;
    }
    public Inventory gameMenu(Player player) {
        Inventory gui = Bukkit.createInventory(player, 54, "Games");
        FixedMetadataValue s = new FixedMetadataValue(plugin, Bukkit.createInventory(player, 54, "Games"));
        player.setMetadata("Games", s);

        ItemStack coin = new ItemStack(Material.SUNFLOWER);

        ItemMeta coinMeta = coin.getItemMeta();
        coinMeta.setDisplayName(ChatColor.GOLD + "Coin Flip");
        ArrayList<String> coinLore = new ArrayList<>();
        coinLore.add(ChatColor.GRAY + "Click to play Coin Flip");
        coinMeta.setLore(coinLore);
        coin.setItemMeta(coinMeta);

        ItemStack[] games = {coin};
        gui.setContents(games);
        return gui;
    }
}
