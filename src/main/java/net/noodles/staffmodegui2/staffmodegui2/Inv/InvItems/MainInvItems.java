package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class MainInvItems {



    public static ItemStack mainMenuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack whitelistMenu() {
        return new ItemBuilder(Material.COMMAND)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack timeMenu() {
        return new ItemBuilder(Material.DAYLIGHT_DETECTOR)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }





}
