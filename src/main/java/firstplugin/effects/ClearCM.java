package firstplugin.effects;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class ClearCM implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (sender instanceof Player) {
                p.getEntityId();
                p.removePotionEffect(PotionEffectType.WATER_BREATHING);
                p.sendMessage(Utils.fixColors(Effects.getPlugin(Effects.class ).getConfig().getString("clear_effect")));
            }

        }
        return true;
    };}