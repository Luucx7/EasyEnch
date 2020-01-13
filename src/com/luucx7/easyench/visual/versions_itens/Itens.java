package com.luucx7.easyench.visual.versions_itens;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

public class Itens {
	
	public static ArrayList<String> EmpLore() {
		ArrayList<String> lore = new ArrayList<>();
		lore.add("");
		return lore;
	}
	
	public static ItemStack itens(Material itemn, String name, ArrayList<String> loree) {
		ItemStack item = new ItemStack(itemn);
		ItemMeta item_meta = item.getItemMeta();
		item_meta.setLore(loree);
		item_meta.setDisplayName(name);
		item.setItemMeta(item_meta);
		return item;
	}
	public static ItemStack itens_nl(Material itemn, String name) {
		ItemStack item = new ItemStack(itemn);
		ItemMeta item_meta = item.getItemMeta();
		item_meta.setDisplayName(name);
		item.setItemMeta(item_meta);
		return item;
	}
	public static ItemStack vidros(Material itemn, String name, Short durability) {
		ItemStack item = new ItemStack(itemn);
	    ItemMeta itemMeta = item.getItemMeta();
	    ((Damageable) itemMeta).setDamage(durability);
	    itemMeta.setDisplayName(name);
	    item.setItemMeta(itemMeta);
		return item;
	}
}
