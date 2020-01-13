package com.luucx7.easyench.visual.versions_events;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

import com.luucx7.easyench.Main;
import com.luucx7.easyench.visual.versions_builders.AllGUI;
import com.luucx7.easyench.visual.versions_builders.ArmorGUI;
import com.luucx7.easyench.visual.versions_builders.BowGUI;
import com.luucx7.easyench.visual.versions_builders.EndGUI;
import com.luucx7.easyench.visual.versions_builders.LevelGUI;
import com.luucx7.easyench.visual.versions_builders.MainGUI;
import com.luucx7.easyench.visual.versions_builders.RodGUI;
import com.luucx7.easyench.visual.versions_builders.SwordsGUI;

import net.md_5.bungee.api.ChatColor;

public class Events_1_11 implements Listener {
	
	private final Main instance = Main.getMain();
	private final FileConfiguration config = instance.getConfig();
	
	@EventHandler
	private void inventoryLeave(InventoryCloseEvent e) {
		if (e.getInventory().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.lvls")))) {
			instance.ench.remove(e.getPlayer());
		}
	}
	@EventHandler
	private void inventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		String i = e.getInventory().getTitle();
		
		// GUIs principais
		if (i.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.main"))) || i.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.c_fish"))) || 
			i.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.c_sword"))) || i.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.c_all"))) || 
			i.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.c_bows"))) || i.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.c_armor"))) ||
		    i.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.lvls"))) || i.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("header.end")))) {
			e.setCancelled(true);
			// debug
			if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType().equals(Material.AIR))) {
                return;
            }
			// Botões de Menu
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("categories.fish")))) {
				RodGUI.v1_8((Player) e.getWhoClicked());
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("categories.all")))) {
				AllGUI.v1_11(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("categories.armor")))) {
				ArmorGUI.v1_9(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("categories.bows")))) {
				BowGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("categories.sword")))) {
				SwordsGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("categories.main")))) {
				MainGUI.v1_8(p);
				if (e.getInventory().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "header.lvls"))) {
					Main.getMain().ench.remove(p);
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("end.close")))) {
				p.closeInventory();
				Main.getMain().ench.remove(p);
				Main.getMain().lvl.remove(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("end.main")))) {
				MainGUI.v1_8(p);
				Main.getMain().ench.remove(p);
				Main.getMain().lvl.remove(p);
			}
			// Enchantments
			// Swords
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.sword.sharpness")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.DAMAGE_ALL);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.sword.bane")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.DAMAGE_ARTHROPODS);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.sword.smite")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.DAMAGE_UNDEAD);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.sword.looting")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.LOOT_BONUS_MOBS);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.sword.fire_aspect")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.FIRE_ASPECT);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.sword.knockback")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.KNOCKBACK);
			}
			// Armor
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.protection")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.PROTECTION_ENVIRONMENTAL);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.blast_protection")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.PROTECTION_EXPLOSIONS);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.fire_protection")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.PROTECTION_FIRE);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.projectile_protection")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.PROTECTION_PROJECTILE);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.feather_falling")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.PROTECTION_FALL);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.respiration")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.OXYGEN);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.aqua_affinity")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.WATER_WORKER);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.thorns")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.THORNS);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.depth_strider")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.DEPTH_STRIDER);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.armor.frost_walker")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.FROST_WALKER);
			}
			// Environmental
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.all.efficiency")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.DIG_SPEED);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.all.silk_touch")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.SILK_TOUCH);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.all.unbreaking")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.DURABILITY);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.all.fortune")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.LOOT_BONUS_BLOCKS);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.all.mending")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.MENDING);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.all.curse_of_vanishing")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.VANISHING_CURSE);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.all.curse_of_binding")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.BINDING_CURSE);
			}
			// bow
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.power")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.ARROW_DAMAGE);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.punch")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.ARROW_KNOCKBACK);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.flame")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.ARROW_FIRE);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.bow.infinity")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.ARROW_INFINITE);
			}
			// fishing rod
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.fish.luck_of_the_sea")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.LUCK);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("enchantment.fish.lure")))) {
				LevelGUI.v1_8(p);
				instance.ench.put(p, Enchantment.LURE);
			}
			// levels
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.one")))) {
				instance.lvl.put(p, 1);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.two")))) {
				instance.lvl.put(p, 2);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.three")))) {
				instance.lvl.put(p, 3);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.four")))) {
				instance.lvl.put(p, 4);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.five")))) {
				instance.lvl.put(p, 5);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.six")))) {
				instance.lvl.put(p, 6);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.seven")))) {
				instance.lvl.put(p, 7);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.eight")))) {
				instance.lvl.put(p, 8);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.nine")))) {
				instance.lvl.put(p, 9);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', config.getString("levels.ten")))) {
				instance.lvl.put(p, 10);
				e.getWhoClicked().getInventory().getItemInMainHand().addUnsafeEnchantment(instance.ench.get(p), instance.lvl.get(p));
				EndGUI.v1_8(p);
			}
		}
	}
}
