package com.gmail.nossr50.datatypes.mods;

import org.bukkit.inventory.ItemStack;

public class CustomBlock {
    private int itemID;
    private byte dataValue;
    private int xpGain;
    private ItemStack itemDrop;

    public CustomBlock(ItemStack itemDrop, int xpGain, byte dataValue, int itemID) {
        this.itemID = itemID;
        this.dataValue = dataValue;
        this.xpGain = xpGain;
        this.itemDrop = itemDrop;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public byte getDataValue() {
        return dataValue;
    }

    public void setDataValue(byte dataValue) {
        this.dataValue = dataValue;
    }

    public int getXpGain() {
        return xpGain;
    }

    public void setXpGain(int xpGain) {
        this.xpGain = xpGain;
    }

    public ItemStack getItemDrop() {
        return itemDrop;
    }

    public void setItemDrop(ItemStack itemDrop) {
        this.itemDrop = itemDrop;
    }
}
