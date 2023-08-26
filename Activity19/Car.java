package Activity19;

public class Car {
    private int model;
    private String name;
    private String color;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Truck.java (Subclass)
 class Truck extends Car {

}

// Van.java (Subclass)
 class Van extends Car {

}
