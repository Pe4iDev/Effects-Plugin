package firstplugin.staminaeffects;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectCM implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;


        if (sender instanceof Player) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.getEntityId();
                p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 99999, 10));
                p.sendMessage(Utils.fixColors(StaminaEffects.getPlugin(StaminaEffects.class ).getConfig().getString("apply_effect")));
            }
        }
        return true;
    };}

