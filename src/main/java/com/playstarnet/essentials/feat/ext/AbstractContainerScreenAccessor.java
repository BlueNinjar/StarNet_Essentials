package com.playstarnet.essentials.feat.ext;

import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;

public interface AbstractContainerScreenAccessor {
    void se$slotChange(Slot slot, int slotId, int mouseButton, ClickType type);

    Slot se$getHoveredSlot();

    AbstractContainerMenu se$getMenu();
}
