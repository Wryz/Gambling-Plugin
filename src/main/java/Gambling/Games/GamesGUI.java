package Gambling.Games;

import Gambling.Utilities.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;

import java.util.ArrayList;

public class GamesGUI {

    private final Inventory gui;

    public GamesGUI() {
        gui = Bukkit.createInventory(null, 54, "Games");
        gui.setItem(10, Utils
                .createGuiItem(Material.SUNFLOWER, ChatColor.GOLD + "Coin Flip", ChatColor.GRAY + "Click to play"));
        for (int i = 0; i <= gui.getSize()-1;i++) {
            if (gui.getItem(i) != null) {
                gui.setItem(i,Utils.createGuiItem(Material.GRAY_STAINED_GLASS_PANE, ""));
            }
        }
    }
    public Inventory gameMenu(Player player) {
        //FixedMetadataValue s = new FixedMetadataValue(plugin, Bukkit.createInventory(player, 54, "Games"));
        //player.setMetadata("Games", s);

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
