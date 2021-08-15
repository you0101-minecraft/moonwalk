package you0101.minecraft.moonwalk;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandClass implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("test")) {
            sender.sendMessage("§a/moonが実行されました！");
            if (args.length == 0) { //サブコマンドの個数が0、つまりサブコマンド無し
                sender.sendMessage("§eミュージックスタート");


                return true; //終わり
            } else { //サブコマンドの個数が0以外
                sender.sendMessage("§eサブコマンドあり!");
                if (args[0].equalsIgnoreCase("hello")) { //サブコマンドが「hello」かどうか
                    sender.sendMessage("§bHello World!");
                } else { //サブコマンドが「hello」以外
                    sender.sendMessage("§eその他のサブコマンドです");
                }
                return true; //終わり
            }
        }
        return false;
    }
}