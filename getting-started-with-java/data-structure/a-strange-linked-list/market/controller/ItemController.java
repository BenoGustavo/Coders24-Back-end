package market.controller;

import market.Item;

public class ItemController {
    private Item[] items;

    public ItemController(Item... args) {
        for (Item item : args) {
            this.addItem(item);
        }
    }

    public final void addItem(Item item) {
        if (items == null) {
            items = new Item[0];

            items[0] = item;
            return;
        }

        Item[] newItems = new Item[items.length + 1];

        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        newItems[items.length] = item;
        items = newItems;
    }

    public void removeItem(int index) {
        // Create a new array of Item objects, one less in size than the original
        Item[] newItems = new Item[items.length - 1];

        // Copy items from the original array to the new array up to the specified index
        for (int i = 0; i < index; i++) {
            newItems[i] = items[i];
        }
        // Copy items from the original array to the new array, skipping the item at the
        // specified index
        for (int i = index + 1; i < items.length; i++) {
            newItems[i - 1] = items[i];
        }

        // swap
        items = newItems;
    }

    public Item[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ItemController{items=[");
        if (items != null) {
            for (int i = 0; i < items.length; i++) {
                sb.append(items[i].toString());
                if (i < items.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
