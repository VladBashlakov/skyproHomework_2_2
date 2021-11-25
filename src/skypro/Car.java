package skypro;

public class Car extends Vehicle{

    private int price;

    public Car(String modelName, int wheelsCount,int price) {
        super(modelName, wheelsCount);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}


