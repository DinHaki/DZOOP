package DZOOP1;

public class Bottle extends Product{

    private int valume; // colorii

    private int fat; // жири

    public void setCol(int col){
        this.valume = col;
    }

    public void setFat(int fat){
        this.fat = fat;
    }

    public Bottle(String brand, String name, double price,int valume, int fat){
        super(brand, name, price);  
        this.valume =valume;
        this.fat = fat;
    
    }

    @Override
    public String dasplayInfo(){
        return String.format("[ВОДА] %s - %s - %.2f - Объём: %d - Жирность: %d",
        brand, name, price, valume, fat);
    }


}
