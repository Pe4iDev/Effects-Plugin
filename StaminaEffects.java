package firstplugin.staminaeffects;

import org.bukkit.plugin.java.JavaPlugin;

public final class StaminaEffects extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
    getCommand("evcl").setExecutor(new ClearCM());
    getCommand("evef").setExecutor(new EffectCM());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
