package DZOOP1;

public class Product{

 protected String name;

 protected String brand;

 protected double price;

 public String getName(){
   return name;
 }

 public void setName(String name){
   this.name = name;
 }



public Product(){
   this("<Product>");
   
}

public Product(String name){
   this(name, 100);
   
}

public Product(String name, double price){
   this("<Brand>", name, 100);
   
}

public Product(String brand, String name, double price){
   if (brand == null || brand.length()<3){
      this.brand = "<Brand>";
   }
   else{
   this.brand = brand;
}
   if (name == null || name.length()<3){
      this.name = "<Name>";
   }
   else{
   this.name = name;
}
   if (price < 100 ){
      this.price = 100;
   }
   else{
   this.price = price;
   }
}


 String dasplayInfo(){
    return String.format("%s - %s - %.2f",brand, name, price);
 }
}