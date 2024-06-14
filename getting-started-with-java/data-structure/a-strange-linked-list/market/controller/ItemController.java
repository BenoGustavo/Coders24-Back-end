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
        Item[] newItems = new Item[items.length - 1];

        for (int i = 0; i < index; i++) {
            newItems[i] = items[i];
        }
        for (int i = index + 1; i < items.length; i++) {
            newItems[i - 1] = items[i];
        }
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
