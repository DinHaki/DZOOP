package DZOOP1;

public class Chocolate extends Product{

    private int col; // colorii

    private int fat; // жири

    public void setCol(int col){
        this.col = col;
    }

    public void setFat(int fat){
        this.fat = fat;
    }

    public Chocolate(String brand, String name, double price,int col, int fat){
        super(brand, name, price);  
        this.col =col;
        this.fat = fat;
    
    }

    @Override
    public String dasplayInfo(){
        return String.format("[ШОКОЛАД] %s - %s - %.2f - Каллории: %d - Жирность: %d",
        brand, name, price, col, fat);
    }


}
