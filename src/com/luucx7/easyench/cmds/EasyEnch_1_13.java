package com.luucx7.easyench.cmds;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.luucx7.easyench.Main;
import com.luucx7.easyench.visual.versions_builders.MainGUI;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;

public class EasyEnch_1_13 implements Listener, CommandExecutor {
	
	private final static FileConfiguration config = Main.getMain().getConfig();
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (sender.hasPermission("easyench.use")) {
				if (p.getInventory().getItemInMainHand().getType()==Material.AIR) {
					p.spigot().sendMessage(new ComponentBuilder("Tenha um item em mãos!").color(ChatColor.RED).create());
				} else {
					MainGUI.v1_13(p);
				}
			} else {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', config.getString("no_perm")));
			}
		} else {
			Bukkit.getConsoleSender().sendMessage(config.getString("not_player"));
		}
		return false;
	}
}
