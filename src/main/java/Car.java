public class Car extends Vehicle {

    private String model;

    public Car(int numberOfWheels, String model){
        super(numberOfWheels);
        this.model = model;
    }

    public String drive(){
        return "Drive car";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
