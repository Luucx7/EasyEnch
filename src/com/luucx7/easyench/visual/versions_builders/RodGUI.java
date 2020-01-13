package com.luucx7.easyench.visual.versions_builders;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.luucx7.easyench.Main;
import com.luucx7.easyench.visual.versions_itens.Itens;
import com.luucx7.easyench.visual.versions_itens.Itens_18;

import net.md_5.bungee.api.ChatColor;

public class RodGUI {

	private final static FileConfiguration config = Main.getMain().getConfig();

	public static void v1_8(Player p) {
		Inventory rod_gui = Bukkit.getServer().createInventory(p, 36, ChatColor.translateAlternateColorCodes('&', config.getString("header.c_fish")));
		for (int i = 0;i<=rod_gui.getSize()-1;i++) {
			rod_gui.setItem(i, Itens_18.vidros(Material.STAINED_GLASS_PANE, " ", (short) 15));
		}
		rod_gui.setItem(11, Itens_18.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.fish.luck_of_the_sea"))));
		rod_gui.setItem(15, Itens_18.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.fish.lure"))));
		rod_gui.setItem(28, Itens_18.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		rod_gui.setItem(29, Itens_18.itens_nl(Material.GOLD_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		rod_gui.setItem(31, Itens_18.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("categories.main"))));
		rod_gui.setItem(33, Itens_18.itens_nl(Material.BOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.bows"))));
		rod_gui.setItem(34, Itens_18.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		p.openInventory(rod_gui);
	}
	
	public static void v1_13(Player p) {
		Inventory rod_gui = Bukkit.getServer().createInventory(p, 36, ChatColor.translateAlternateColorCodes('&', config.getString("header.c_fish")));
		for (int i = 0;i<=rod_gui.getSize()-1;i++) {
			rod_gui.setItem(i, Itens.itens_nl(Material.BLACK_STAINED_GLASS_PANE, " "));
		}
		rod_gui.setItem(11, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.fish.luck_of_the_sea"))));
		rod_gui.setItem(15, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.fish.lure"))));
		rod_gui.setItem(28, Itens.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		rod_gui.setItem(29, Itens.itens_nl(Material.GOLDEN_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		rod_gui.setItem(30, Itens.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("categories.main"))));
		rod_gui.setItem(32, Itens.itens_nl(Material.TRIDENT, ChatColor.translateAlternateColorCodes('&', config.getString("categories.trident"))));
		rod_gui.setItem(33, Itens.itens_nl(Material.BOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.bows"))));
		rod_gui.setItem(34, Itens.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		p.openInventory(rod_gui);
	}
	
	public static void v1_14(Player p) {
		Inventory rod_gui = Bukkit.getServer().createInventory(p, 36, ChatColor.translateAlternateColorCodes('&', config.getString("header.c_fish")));
		for (int i = 0;i<=rod_gui.getSize()-1;i++) {
			rod_gui.setItem(i, Itens.itens_nl(Material.BLACK_STAINED_GLASS_PANE, " "));
		}
		rod_gui.setItem(11, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.fish.luck_of_the_sea"))));
		rod_gui.setItem(15, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.fish.lure"))));
		rod_gui.setItem(28, Itens.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		rod_gui.setItem(29, Itens.itens_nl(Material.GOLDEN_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		rod_gui.setItem(30, Itens.itens_nl(Material.CROSSBOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.crossbow"))));
		rod_gui.setItem(31, Itens.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("categories.main"))));
		rod_gui.setItem(32, Itens.itens_nl(Material.TRIDENT, ChatColor.translateAlternateColorCodes('&', config.getString("categories.trident"))));
		rod_gui.setItem(33, Itens.itens_nl(Material.BOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.bows"))));
		rod_gui.setItem(34, Itens.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		p.openInventory(rod_gui);
	}
}
