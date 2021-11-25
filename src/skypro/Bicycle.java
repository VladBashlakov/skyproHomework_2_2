package skypro;

public class Bicycle extends Vehicle{
     private String colour;

    public Bicycle(String modelName, int wheelsCount, String colour) {
        super(modelName, wheelsCount);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}

