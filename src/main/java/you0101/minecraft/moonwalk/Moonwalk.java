package you0101.minecraft.moonwalk;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public final class Moonwalk extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("マイクラ・ジャクソン");
    }



    @Override
    public boolean onCommand(CommandSender sender, Command command,String label,String[] args){
        if(label.equalsIgnoreCase("moonwalk")) {
            sender.sendMessage("ムーンウォークしました");
            Player player = null;
            if (sender instanceof Player){
                player = (Player) sender;
                player.setVelocity(new Vector(6f, 0f, 0f));
                return true;
            } else {
                sender.sendMessage("コンソールからは無理");
                return true;

            }





        }
        return true;
    }




    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("マイクラ・ジャクソン逝去");
    }
}



