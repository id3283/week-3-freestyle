package storeexercise;

import java.util.ArrayList;

public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = generateInventory();

        for (Product p: inventory) {
            System.out.println( p.getName() + " " +  p.getPrice() );
        }

//        System.out.println("We carry the following inventory: ");
//        for (int i = 0; i < inventory.size(); i++) {
//            Product p = inventory.get(i);
//            System.out.printf("id: %d %s - Price: $%.2f%n",
//                    p.getId(), p.getName(), p.getPrice());
//        }
    }

    public static ArrayList<Product> generateInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(89, "Eyepatch", 10));
        inventory.add(new Product(77, "Pegleg", 20));

        Product p = new Product(1, "Cannon", 5000);
        inventory.add(p);

        inventory.add( new Product(2, "Cutlass", 200) );

        p = new Product(5, "Parrot", 25);
        inventory.add(p);


        return inventory;
    }
}