package com.luucx7.easyench;

import java.util.LinkedHashMap;

import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.luucx7.easyench.cmds.EasyEnch_1_13;
import com.luucx7.easyench.cmds.EasyEnch_1_14;
import com.luucx7.easyench.cmds.EasyEnch_1_8;
import com.luucx7.easyench.cmds.EasyEnch_1_9;
import com.luucx7.easyench.visual.versions_events.Events_1_8;
import com.luucx7.easyench.visual.versions_events.Events_1_9;

import net.md_5.bungee.api.ChatColor;

import com.luucx7.easyench.visual.versions_events.Events_1_11;
import com.luucx7.easyench.visual.versions_events.Events_1_11_1;
import com.luucx7.easyench.visual.versions_events.Events_1_13;
import com.luucx7.easyench.visual.versions_events.Events_1_14;

public class Main extends JavaPlugin implements Listener {
	
	public LinkedHashMap<Player, Enchantment> ench = new LinkedHashMap<>();
	public LinkedHashMap<Player, Integer> lvl = new LinkedHashMap<>();
	
	public String version = Bukkit.getServer().getBukkitVersion();

	public void onEnable() {
		this.saveDefaultConfig();
		version=Bukkit.getServer().getVersion();
		
		Bukkit.getConsoleSender().sendMessage("[EasyEnch] Loading minecraft server version: "+version);
		// Version-specific loaders
		if (version.contains("1.8")) {
			this.getCommand("easyench").setExecutor(new EasyEnch_1_8());
			this.getServer().getPluginManager().registerEvents(new Events_1_8(), this);
		}
		
		if (version.contains("1.9.2") || version.contains("1.9.4") || version.contains("1.10")) {
			this.getCommand("easyench").setExecutor(new EasyEnch_1_9());
			this.getServer().getPluginManager().registerEvents(new Events_1_9(), this);
		}
		
		if (version.contains("1.11.1") || version.contains("1.11.2") || version.contains("1.12")) {
			this.getCommand("easyench").setExecutor(new EasyEnch_1_9());
			this.getServer().getPluginManager().registerEvents(new Events_1_11_1(), this);
		}
		
		if (version.contains("1.13")) {
			this.getCommand("easyench").setExecutor(new EasyEnch_1_13());
			this.getServer().getPluginManager().registerEvents(new Events_1_13(), this);
		}
		
		if (version.contains("1.14") || version.contains("1.15")) {
			this.getCommand("easyench").setExecutor(new EasyEnch_1_14());
			this.getServer().getPluginManager().registerEvents(new Events_1_14(), this);
		}
		
		else if (version.contains("1.11")) {
			this.getCommand("easyench").setExecutor(new EasyEnch_1_9());
			this.getServer().getPluginManager().registerEvents(new Events_1_11(), this);
			Bukkit.getConsoleSender().sendMessage("Your server is running on 1.11, but the enchantment Sweeping Edge is avaliable only on Spigot 1.11.1\nPlease update to 1.11.1 or newer.");
		}
		
		else if (version.contains("1.9")) {
			this.getCommand("easyench").setExecutor(new EasyEnch_1_9());
			this.getServer().getPluginManager().registerEvents(new Events_1_8(), this);
			Bukkit.getConsoleSender().sendMessage("Your server is running on 1.9, but 1.9 enchantments are unnuported on Spigot 1.9\nPlease update to 1.9.2 or newer.");
		} 
		
		else {
			this.getCommand("easyench").setExecutor(new EasyEnch_1_8());
			this.getServer().getPluginManager().registerEvents(new EasyEnch_1_8(), this);
			Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED+"ERROR WHILE LOADING EASYENCH: UNKNOWN VERSION");
			Bukkit.getConsoleSender().sendMessage("This error occurred because the plugin didn't loaded any version from 1.8 up to 1.15");
			Bukkit.getConsoleSender().sendMessage("Look for newer versions, check your server or contact the developer.");
			Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GRAY+"By default, the 1.8 version was loaded.");
		}
		Bukkit.getConsoleSender().sendMessage("[EasyEnch] Plugin loaded.");
	}
	public static Main getMain() {
		return (Main) Bukkit.getPluginManager().getPlugin("EasyEnch");
	}
}
