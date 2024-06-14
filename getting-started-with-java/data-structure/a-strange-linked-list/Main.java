import market.Item;
import market.controller.ItemController;

class Main {
    public static void main(String[] args) {
        Item item1 = new Item("sabonete", "cheiro de flores");
        Item item2 = new Item("shampoo", "cheiro de frutas");
        Item item3 = new Item("condicionador", "cheiro de ervas");

        ItemController carrinho = new ItemController(item1, item2, item3);

        System.out.println(
                "Item 1:\n" + item1.toString() + "\n\nItem 2:\n" + item2.toString() + "\n\nItem3:\n"
                        + item3.toString());
        System.out.println("\nCarrinho: \n" + carrinho.toString());
    }

}