package Gambling.Games;

import Gambling.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;

import java.awt.*;


public class CoinFlip {

    private Core plugin;
    private GamesConfig config;

    private double winChance;
    private int winCount;
    private int lossCount;

    public CoinFlip(Core plugin, Player player) {
        this.plugin = plugin;
        this.winChance = 10;
        this.winCount = 0;
        this.lossCount = 0;
        FixedMetadataValue gui = new FixedMetadataValue(plugin, Bukkit.createInventory(player, 54, "Games"));
        player.setMetadata("Games", gui);
    }

    public void playCoinFlip(Inventory e) {
        if (config.CoinFlip) {

        }
    }



    private ItemStack getWinChance() {
        ItemStack coin = new ItemStack(Material.SUNFLOWER);
        ItemMeta coinMeta = coin.getItemMeta();
        coinMeta.setDisplayName(Double.toString(winChance));
        coin.setItemMeta(coinMeta);
        return coin;
    }
}
