package storeexercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class StoreApp {
    public static void main(String[] args) {
//        ArrayList<Product> inventory = generateInventory();
//        ArrayList<Product> inventory = loadInventory("src/main/resources/inventory.csv");
        HashMap<String,Product> inventoryMap = loadInventoryMap("src/main/resources/inventory.csv");

        String userInput = "Eyepatch";

        Product foundProduct = inventoryMap.get(userInput);
        System.out.println(foundProduct.toString());
//        for (Product p: inventory) {
//            System.out.println( p.getName() + " " +  p.getPrice() );
//        }
//        System.out.println("We carry the following inventory: ");
//        for (int i = 0; i < inventory.size(); i++) {
//            Product p = inventory.get(i);
//            System.out.printf("id: %d %s - Price: $%.2f%n",
//                    p.getId(), p.getName(), p.getPrice());
//        }
    }

    private static HashMap<String, Product> loadInventoryMap(String fileName) {
        HashMap<String, Product> productNameMap = new HashMap<>();
        ArrayList<Product> arrayList = loadInventory(fileName);

        for (Product p : arrayList) {
            String productName = p.getName();

            productNameMap.put(productName, p);
        }
        return productNameMap;
    }

    private static ArrayList<Product> loadInventory(String fileName) {
        ArrayList<Product> products = new ArrayList<Product>();

        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            String line = bufferedReader.readLine();
            line = bufferedReader.readLine();

            while(line != null) {
                String[] lineParts = line.split("\\|");
                int id = Integer.parseInt(lineParts[0]);
                String name = lineParts[1];
                double price = Double.parseDouble(lineParts[2]);

                Product p = new Product(id, name, price);
                products.add(p);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return products;
    }


    /**
     * Generate inventory from hard-coded values
     * @return
     */
    public static ArrayList<Product> generateInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(89, "Eyepatch", 10));
        inventory.add(new Product(77, "Pegleg", 20));
        inventory.add(new Product(1, "Cannon", 5000));
        inventory.add( new Product(2, "Cutlass", 200) );
        inventory.add(new Product(5, "Parrot", 25));

        return inventory;
    }


}