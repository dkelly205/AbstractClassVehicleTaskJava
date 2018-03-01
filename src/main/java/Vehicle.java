public abstract class Vehicle {

    private int numberOfWheels;

    public Vehicle(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public String startEngine(){
        return "Broom broom";
    }

    public abstract String drive();


}
