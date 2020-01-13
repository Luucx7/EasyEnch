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

public class BowGUI {
	
	private final static FileConfiguration config = Main.getMain().getConfig();

	public static void v1_8(Player p) {
		Inventory gui = Bukkit.getServer().createInventory(p, 36,ChatColor.translateAlternateColorCodes('&', config.getString("header.c_bows")));
		for (int i = 0;i<=gui.getSize()-1;i++) {
			gui.setItem(i, Itens_18.vidros(Material.STAINED_GLASS_PANE, " ", (short) 15));
		}
		gui.setItem(10, Itens_18.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.power"))));
		gui.setItem(12, Itens_18.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.punch"))));
		gui.setItem(14, Itens_18.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.flame"))));
		gui.setItem(16, Itens_18.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.infinity"))));
		gui.setItem(28, Itens_18.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		gui.setItem(29, Itens_18.itens_nl(Material.GOLD_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		gui.setItem(31, Itens_18.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("categories.main"))));
		gui.setItem(33, Itens_18.itens_nl(Material.FISHING_ROD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.fish"))));
		gui.setItem(34, Itens_18.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		p.openInventory(gui);
	}
	
	public static void v1_13(Player p) {
		Inventory gui = Bukkit.getServer().createInventory(p, 36,ChatColor.translateAlternateColorCodes('&', config.getString("header.c_bows")));
		for (int i = 0;i<=gui.getSize()-1;i++) {
			gui.setItem(i, Itens.itens_nl(Material.BLACK_STAINED_GLASS_PANE, " "));
		}
		gui.setItem(10, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.power"))));
		gui.setItem(12, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.punch"))));
		gui.setItem(14, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.flame"))));
		gui.setItem(16, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.infinity"))));
		gui.setItem(28, Itens.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		gui.setItem(29, Itens.itens_nl(Material.GOLDEN_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		gui.setItem(30, Itens.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("categories.main"))));
		gui.setItem(32, Itens.itens_nl(Material.TRIDENT, ChatColor.translateAlternateColorCodes('&', config.getString("categories.trident"))));
		gui.setItem(33, Itens.itens_nl(Material.FISHING_ROD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.fish"))));
		gui.setItem(34, Itens.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		p.openInventory(gui);
	}
	
	public static void v1_14(Player p) {
		Inventory gui = Bukkit.getServer().createInventory(p, 36,ChatColor.translateAlternateColorCodes('&', config.getString("header.c_bows")));
		for (int i = 0;i<=gui.getSize()-1;i++) {
			gui.setItem(i, Itens.itens_nl(Material.BLACK_STAINED_GLASS_PANE, " "));
		}
		gui.setItem(10, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.power"))));
		gui.setItem(12, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.punch"))));
		gui.setItem(14, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.flame"))));
		gui.setItem(16, Itens.itens_nl(Material.ENCHANTED_BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.infinity"))));
		gui.setItem(28, Itens.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		gui.setItem(29, Itens.itens_nl(Material.GOLDEN_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		gui.setItem(30, Itens.itens_nl(Material.CROSSBOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.crossbow"))));
		gui.setItem(31, Itens.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("categories.main"))));
		gui.setItem(32, Itens.itens_nl(Material.TRIDENT, ChatColor.translateAlternateColorCodes('&', config.getString("categories.trident"))));
		gui.setItem(33, Itens.itens_nl(Material.FISHING_ROD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.fish"))));
		gui.setItem(34, Itens.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		p.openInventory(gui);
	}
}
