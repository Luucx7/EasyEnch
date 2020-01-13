package com.luucx7.easyench.visual.versions_builders;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.luucx7.easyench.Main;
import com.luucx7.easyench.visual.versions_itens.Itens_18;

import net.md_5.bungee.api.ChatColor;

public class LevelGUI {

	private final static FileConfiguration config = Main.getMain().getConfig();

	public static void v1_8(Player p) {
		Inventory gui = Bukkit.getServer().createInventory(p, 45, ChatColor.translateAlternateColorCodes('&', config.getString("header.lvls")));
		for (int i = 0;i<=gui.getSize()-1;i++) {
			gui.setItem(i, Itens_18.vidros(Material.STAINED_GLASS_PANE, " ", (short) 15));
		}
		gui.setItem(10, Itens_18.itens_nl(Material.STONE, ChatColor.translateAlternateColorCodes('&', config.getString("levels.one"))));
		gui.setItem(19, Itens_18.itens_nl(Material.DIRT, ChatColor.translateAlternateColorCodes('&', config.getString("levels.two"))));
		gui.setItem(28, Itens_18.itens_nl(Material.COAL_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.three"))));
		gui.setItem(12, Itens_18.itens_nl(Material.IRON_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.four"))));
		gui.setItem(21, Itens_18.itens_nl(Material.QUARTZ_ORE, ChatColor.translateAlternateColorCodes('&', config.getString("levels.five"))));
		gui.setItem(14, Itens_18.itens_nl(Material.REDSTONE_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.six"))));
		gui.setItem(23, Itens_18.itens_nl(Material.LAPIS_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.seven"))));
		gui.setItem(16, Itens_18.itens_nl(Material.GOLD_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.eight"))));
		gui.setItem(25, Itens_18.itens_nl(Material.DIAMOND_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.nine"))));
		gui.setItem(34, Itens_18.itens_nl(Material.EMERALD_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.ten"))));
		gui.setItem(40, Itens_18.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("categories.main"))));
		p.openInventory(gui);
	}
	
	public static void v1_13(Player p) {
		Inventory gui = Bukkit.getServer().createInventory(p, 45, ChatColor.translateAlternateColorCodes('&', config.getString("header.lvls")));
		for (int i = 0;i<=gui.getSize()-1;i++) {
			gui.setItem(i, Itens_18.itens_nl(Material.BLACK_STAINED_GLASS_PANE, " "));
		}
		gui.setItem(10, Itens_18.itens_nl(Material.STONE, ChatColor.translateAlternateColorCodes('&', config.getString("levels.one"))));
		gui.setItem(19, Itens_18.itens_nl(Material.DIRT, ChatColor.translateAlternateColorCodes('&', config.getString("levels.two"))));
		gui.setItem(28, Itens_18.itens_nl(Material.COAL_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.three"))));
		gui.setItem(12, Itens_18.itens_nl(Material.IRON_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.four"))));
		gui.setItem(21, Itens_18.itens_nl(Material.NETHER_QUARTZ_ORE, ChatColor.translateAlternateColorCodes('&', config.getString("levels.five"))));
		gui.setItem(14, Itens_18.itens_nl(Material.REDSTONE_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.six"))));
		gui.setItem(23, Itens_18.itens_nl(Material.LAPIS_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.seven"))));
		gui.setItem(16, Itens_18.itens_nl(Material.GOLD_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.eight"))));
		gui.setItem(25, Itens_18.itens_nl(Material.DIAMOND_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.nine"))));
		gui.setItem(34, Itens_18.itens_nl(Material.EMERALD_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("levels.ten"))));
		gui.setItem(40, Itens_18.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("categories.main"))));
		p.openInventory(gui);
	}
}
