package com.luucx7.easyench.visual.versions_builders;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.luucx7.easyench.Main;
import com.luucx7.easyench.visual.versions_itens.Itens;
import com.luucx7.easyench.visual.versions_itens.Itens_18;

import net.md_5.bungee.api.ChatColor;

public class MainGUI {
	
	private final static FileConfiguration config = Main.getMain().getConfig();
	
	public static void v1_8(Player p) {
		Inventory help_gui = Bukkit.getServer().createInventory(p, 45, ChatColor.translateAlternateColorCodes('&', config.getString("header.main")));
		for (int i = 0;i<=help_gui.getSize()-1;i++) {
			help_gui.setItem(i, Itens_18.vidros(Material.STAINED_GLASS_PANE, " ", (short) 15));
		}
		help_gui.setItem(11, Itens_18.itens_nl(Material.FISHING_ROD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.fish"))));
		help_gui.setItem(15, Itens_18.itens_nl(Material.BOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.bows"))));
		help_gui.setItem(22, Itens_18.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		help_gui.setItem(29, Itens_18.itens_nl(Material.GOLD_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		help_gui.setItem(33, Itens_18.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		//
		ArrayList<String> about = new ArrayList<>();
		String version = Bukkit.getServer().getPluginManager().getPlugin("EasyEnch").getDescription().getVersion();
		if (config.getString("madeby_language").equalsIgnoreCase("pt")) {
			about.add("§7Versão "+version);
			about.add(" ");
			about.add("§7Autor: Luucx7");
		} else {
			about.add("§7Version "+version);
			about.add(" ");
			about.add("§7Author: Luucx7");
		}
		help_gui.setItem(44, Itens_18.itens(Material.ENCHANTED_BOOK, "§8§lEasyEnch", about));
		p.openInventory(help_gui);
	}
	
	public static void v1_13(Player p) {
		Inventory help_gui = Bukkit.getServer().createInventory(p, 45, ChatColor.translateAlternateColorCodes('&', config.getString("header.main")));
		for (int i = 0;i<=help_gui.getSize()-1;i++) {
			help_gui.setItem(i, Itens.itens_nl(Material.BLACK_STAINED_GLASS_PANE, " "));
		}
		help_gui.setItem(12, Itens.itens_nl(Material.FISHING_ROD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.fish"))));
		help_gui.setItem(14, Itens.itens_nl(Material.BOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.bows"))));
		help_gui.setItem(19, Itens.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		help_gui.setItem(25, Itens.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		help_gui.setItem(30, Itens.itens_nl(Material.GOLDEN_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		help_gui.setItem(32, Itens.itens_nl(Material.TRIDENT, ChatColor.translateAlternateColorCodes('&', config.getString("categories.trident"))));
		//
		ArrayList<String> about = new ArrayList<>();
		String version = Bukkit.getServer().getPluginManager().getPlugin("EasyEnch").getDescription().getVersion();
		if (config.getString("madeby_language").equalsIgnoreCase("pt")) {
			about.add("§7Versão "+version);
			about.add(" ");
			about.add("§7Autor: Luucx7");
		} else {
			about.add("§7Version "+version);
			about.add(" ");
			about.add("§7Author: Luucx7");
		}
		help_gui.setItem(44, Itens_18.itens(Material.ENCHANTED_BOOK, "§8§lEasyEnch", about));
		p.openInventory(help_gui);
	}
	
	public static void v1_14(Player p) {
		Inventory help_gui = Bukkit.getServer().createInventory(p, 45, ChatColor.translateAlternateColorCodes('&', config.getString("header.main")));
		for (int i = 0;i<=help_gui.getSize()-1;i++) {
			help_gui.setItem(i, Itens.itens_nl(Material.BLACK_STAINED_GLASS_PANE, " "));
		}
		help_gui.setItem(10, Itens.itens_nl(Material.IRON_PICKAXE, ChatColor.translateAlternateColorCodes('&', config.getString("categories.all"))));
		help_gui.setItem(12, Itens.itens_nl(Material.FISHING_ROD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.fish"))));
		help_gui.setItem(14, Itens.itens_nl(Material.BOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.bows"))));
		help_gui.setItem(16, Itens.itens_nl(Material.IRON_SWORD, ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword"))));
		help_gui.setItem(29, Itens.itens_nl(Material.GOLDEN_HELMET, ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor"))));
		help_gui.setItem(31, Itens.itens_nl(Material.CROSSBOW, ChatColor.translateAlternateColorCodes('&', config.getString("categories.crossbow"))));
		help_gui.setItem(33, Itens.itens_nl(Material.TRIDENT, ChatColor.translateAlternateColorCodes('&', config.getString("categories.trident"))));
		//
		ArrayList<String> about = new ArrayList<>();
		String version = Bukkit.getServer().getPluginManager().getPlugin("EasyEnch").getDescription().getVersion();
		if (config.getString("madeby_language").equalsIgnoreCase("pt")) {
			about.add("§7Versão "+version);
			about.add(" ");
			about.add("§7Autor: Luucx7");
		} else {
			about.add("§7Version "+version);
			about.add(" ");
			about.add("§7Author: Luucx7");
		}
		help_gui.setItem(44, Itens_18.itens(Material.ENCHANTED_BOOK, "§8§lEasyEnch", about));
		p.openInventory(help_gui);
	}
}
