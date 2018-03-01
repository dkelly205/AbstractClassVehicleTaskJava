import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Car car;
    MotorBike motorBike;


    @Before
    public void before(){
        car = new Car(4, "Ford");
        motorBike = new MotorBike(2);
    }

    @Test
    public void carCanDrive(){
        assertEquals("Drive car", car.drive());
    }

    @Test
    public void setMotorBikeCanDrive(){
        assertEquals("Ride motorbike", motorBike.drive());
    }

    @Test
    public void carCanStart(){
        assertEquals("Broom broom", car.startEngine());
    }

    @Test
    public void motorBikeCanStart(){
        assertEquals("Broom broom", motorBike.startEngine());
    }

    @Test
    public void getCarNumberOfWheels(){
        assertEquals(4, car.getNumberOfWheels());
    }

    @Test
    public void getMotorBikeNumberOfWheels(){
        assertEquals(2, motorBike.getNumberOfWheels());
    }

    @Test
    public void carHasModel(){
        assertEquals("Ford", car.getModel());
    }

    @Test
    public void setCarModel(){
        car.setModel("Renault");
        assertEquals("Renault", car.getModel());
    }

}
