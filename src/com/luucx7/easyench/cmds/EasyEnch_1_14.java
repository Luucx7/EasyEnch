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
import com.luucx7.easyench.api.Title;
import com.luucx7.easyench.visual.versions_builders.MainGUI;

import net.md_5.bungee.api.ChatColor;

public class EasyEnch_1_14 implements Listener, CommandExecutor {
	
	private final static FileConfiguration config = Main.getMain().getConfig();
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (sender.hasPermission("easyench.use")) {
				if (p.getInventory().getItemInMainHand().getType()==Material.AIR) {
					Title title = new Title();
					title.sendTitle(p, config.getString("no_item"), 1, 10000, 3, org.bukkit.ChatColor.RED);
					p.sendMessage("teste");
				} else {
					MainGUI.v1_14(p);
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
