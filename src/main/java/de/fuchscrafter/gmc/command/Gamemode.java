package de.fuchscrafter.gmc.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor{

    private String gm;

    public Gamemode(String gm) {
        this.gm = gm;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        //todo: add target player as parameter

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players may use this command!");
            return true;
        }

        String senderName = sender.getName();
        String command = "/gamemode " + this.gm + " " + senderName;
        ((Player) sender).chat(command);

        return true;
    }

    public String getGm() {
        return gm;
    }

    public void setGm(String gm) {
        this.gm = gm;
    }
}
