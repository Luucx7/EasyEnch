package com.luucx7.easyench.visual.versions_builders;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.luucx7.easyench.Main;
import com.luucx7.easyench.visual.versions_itens.Itens_18;

import net.md_5.bungee.api.ChatColor;

public class EndGUI {

	private final static FileConfiguration config = Main.getMain().getConfig();

	public static void v1_8(Player p) {
		Inventory gui = Bukkit.getServer().createInventory(p, 45,ChatColor.translateAlternateColorCodes('&', config.getString("header.end")));
		for (int i = 0;i<=gui.getSize()-1;i++) {
			gui.setItem(i, Itens_18.vidros(Material.STAINED_GLASS_PANE, " ", (short) 15));
		}
		gui.setItem(22, Itens_18.itens_nl(Material.EMERALD_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("end.item"))));
		gui.setItem(39, Itens_18.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("end.main"))));
		gui.setItem(41, Itens_18.itens_nl(Material.REDSTONE_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("end.close"))));
		Main.getMain().ench.remove(p);
		Main.getMain().lvl.remove(p);
		p.openInventory(gui);
	}
	
	public static void v1_13(Player p) {
		Inventory gui = Bukkit.getServer().createInventory(p, 45,ChatColor.translateAlternateColorCodes('&', config.getString("header.end")));
		for (int i = 0;i<=gui.getSize()-1;i++) {
			gui.setItem(i, Itens_18.itens_nl(Material.BLACK_STAINED_GLASS_PANE, " "));
		}
		gui.setItem(22, Itens_18.itens_nl(Material.EMERALD_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("end.item"))));
		gui.setItem(39, Itens_18.itens_nl(Material.BOOK, ChatColor.translateAlternateColorCodes('&', config.getString("end.main"))));
		gui.setItem(41, Itens_18.itens_nl(Material.REDSTONE_BLOCK, ChatColor.translateAlternateColorCodes('&', config.getString("end.close"))));
		Main.getMain().ench.remove(p);
		Main.getMain().lvl.remove(p);
		p.openInventory(gui);
	}
}
