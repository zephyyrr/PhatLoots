package com.codisimus.plugins.phatloots.gui;

import com.codisimus.plugins.phatloots.PhatLoot;
import com.codisimus.plugins.phatloots.loot.Loot;
import java.util.List;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * Buttons execute actions on click
 * Actions are typically adding new Loot
 *
 * @author Cody
 */
public abstract class Button {
    private static int currentSlot = InventoryListener.TOOL_SLOT + 1;
    private int slot;
    private ItemStack item;

    /**
     * Completes the Button's action
     *
     * @param inv The current GUI Inventory
     * @param phatLoot The PhatLoot Which is being modified
     * @param lootList The current List of Loot (may be a collection)
     * @return true if the page should be refreshed
     */
    public abstract boolean onClick(Inventory inv, PhatLoot phatLoot, List<Loot> lootList);

    /**
     * Constructs a new Button
     *
     * @param item The ItemStack that represents the Button
     */
    public Button(ItemStack item) {
        this.item = item;
        slot = currentSlot++;
    }

    /**
     * Returns the number of the Button's slot
     *
     * @return The slot of the Button
     */
    public int getSlot() {
        return slot;
    }

    /**
     * Returns the ItemStack of the Button
     *
     * @return The ItemStack of the Button
     */
    public ItemStack getItem() {
        return item;
    }
}
