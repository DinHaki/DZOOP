package DZOOP1;

import java.util.ArrayList;

public class Prod {
    public static void main(String[] args){

        // Product product1 = new Product("OOO Milka","_",100 );
        // // product1.name = "Chocolate";
        // // product1.brand = "OOO Milka";
        // // product1.price = 210;
        // System.out.println(product1.dasplayInfo());

        // Product product2 = new Product();
        // System.out.println(product2.dasplayInfo());

        // Product product3 = new Product("Chocolate(3)",100);
        // System.out.println(product3.dasplayInfo());

        Product chocolate1 = new Chocolate("OOO Milka","Chocolate",200,1000,40 );
        System.out.println(chocolate1.dasplayInfo());

        Product bottle1 = new Bottle("OOO Vodi4ka","VodaInBottle",150,1500,10 );
        System.out.println(bottle1.dasplayInfo());
 
        ArrayList<Product>arrayList = new ArrayList<>();
        arrayList.add(chocolate1);
        arrayList.add(bottle1);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        Chocolate chocolate = vendingMachine.getChocolate("Chocolate" );
        if(chocolate != null){
            System.out.println("Вы приобрели:");
            System.out.println(chocolate.dasplayInfo());
        }
        else{
            System.out.println("Такого товара нет");
        }

    }

}
