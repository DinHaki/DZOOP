package DZOOP1;

// import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public Chocolate getChocolate(String name) {
        return null;
    }

    // public Chocolate getChocolate(String name, int col){
    //     for (Product product: products){
    //         if(product instanceof Chocolate)(
    //             Chocolate chocolate = (Chocolate)product;
    //             if chocolate.getName().equals(name))
    //         )
    //     }
    // }

}
