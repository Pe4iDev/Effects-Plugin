package firstplugin.effects;

import org.bukkit.plugin.java.JavaPlugin;

public final class Effects extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getCommand("evcl").setExecutor(new ClearCM());
        getCommand("evef").setExecutor((new EffectCM()));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

