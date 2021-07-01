package me.sjaeledyr.transcendentmobs;

import me.sjaeledyr.transcendentmobs.util.EventListener;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static FileConfiguration config;
    @Override
    public void onEnable() {
        config=getConfig();
        this.saveDefaultConfig();
        // Plugin startup logic
        System.out.println("[TranscendentMobs] TranscendentMobs by Sjaeledyr has been Loaded! ");
        System.out.println("Plugin Version 1.0");

        // Set up event listener
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        config.set("test", true);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[TranscendentMobs] TranscendentMobs has been disabled!");
        config = null;
    }


}
