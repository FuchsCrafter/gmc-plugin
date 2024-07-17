package de.fuchscrafter.gmc;

import de.fuchscrafter.gmc.command.Gamemode;
import de.fuchscrafter.gmc.command.nightvision.DisableNV;
import de.fuchscrafter.gmc.command.nightvision.ToggleNV;
import org.bukkit.plugin.java.JavaPlugin;

public final class GmcPlugin extends JavaPlugin {


    public final GmcPlugin getInstance () {
        return this;
    }
    public final GmcPlugin instance = getInstance();


    @Override
    public void onEnable() {

        // Plugin startup logic
        this.getCommand("gmc").setExecutor(new Gamemode("creative"));
        this.getCommand("gms").setExecutor(new Gamemode("survival"));
        this.getCommand("gma").setExecutor(new Gamemode("adventure"));
        this.getCommand("gmsp").setExecutor(new Gamemode("spectator"));

        this.getCommand("nv").setExecutor(new ToggleNV());
        this.getCommand("nightvision").setExecutor(new ToggleNV());
        this.getCommand("nnv").setExecutor(new DisableNV());

        this.getLogger().info("Welcome to GMC!");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Bye!");
    }
}
