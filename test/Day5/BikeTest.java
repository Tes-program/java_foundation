package Day5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Day5.Assignment.Bike;

public class BikeTest {

    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void bikeShouldTurnOn() {
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeShouldTurnOff() {
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void speedShouldResetToZeroWhenTurnedOff() {
        bike.turnOn();
        bike.accelerate();
        bike.turnOff();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void gearShouldResetToOneWhenTurnedOff() {
        bike.turnOn();
        bike.accelerate();
        bike.turnOff();
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeShouldNotAccelerateWhenOff() {
        bike.accelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeShouldNotDecelerateWhenOff() {
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeShouldAccelerateByOneOnGearOne() {
        bike.turnOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void bikeShouldDecelerateByOneOnGearOne() {
        bike.turnOn();
        for (int i = 0; i < 15; i++) {
            bike.accelerate();
        }
        int speedBeforeDecelerate = bike.getSpeed();
        bike.decelerate();
        assertEquals(speedBeforeDecelerate - 1, bike.getSpeed());
    }

    @Test
    public void bikeShouldShiftToGearTwoWhenSpeedExceeds20() {
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.accelerate();
        }
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeShouldAccelerateByTwoOnGearTwo() {
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.accelerate();
        }
        int speedBeforeAccelerate = bike.getSpeed();
        bike.accelerate();
        assertEquals(speedBeforeAccelerate + 1, bike.getSpeed());
    }

    @Test
    public void bikeShouldDecelerateByTwoOnGearTwo() {
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.accelerate();
        }
        int speedBeforeDecelerate = bike.getSpeed();
        bike.decelerate();
        assertEquals(speedBeforeDecelerate - 1, bike.getSpeed());
    }

    @Test
    public void bikeShouldShiftToGearThreeWhenSpeedExceeds30() {
        bike.turnOn();
        for (int i = 0; i < 31; i++) {
            bike.accelerate();
        }
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeShouldAccelerateByThreeOnGearThree() {
        bike.turnOn();
        for (int i = 0; i < 31; i++) {
            bike.accelerate();
        }
        int speedBeforeAccelerate = bike.getSpeed();
        bike.accelerate();
        assertEquals(speedBeforeAccelerate + 1, bike.getSpeed());
    }

    @Test
    public void bikeShouldDecelerateByThreeOnGearThree() {
        bike.turnOn();
        for (int i = 0; i < 35; i++) {
            bike.accelerate();
        }
        int speedBeforeDecelerate = bike.getSpeed();
        bike.decelerate();
        assertEquals(speedBeforeDecelerate - 1, bike.getSpeed());
    }

    @Test
    public void bikeShouldShiftToGearFourWhenSpeedExceeds40() {
        bike.turnOn();
        for (int i = 0; i < 41; i++) {
            bike.accelerate();
        }
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeShouldAccelerateByFourOnGearFour() {
        bike.turnOn();
        for (int i = 0; i < 41; i++) {
            bike.accelerate();
        }
        int speedBeforeAccelerate = bike.getSpeed();
        bike.accelerate();
        assertEquals(speedBeforeAccelerate + 1, bike.getSpeed());
    }

    @Test
    public void bikeShouldDecelerateByFourOnGearFour() {
        bike.turnOn();
        for (int i = 0; i < 44; i++) {
            bike.accelerate();
        }
        int speedBeforeDecelerate = bike.getSpeed();
        bike.decelerate();
        assertEquals(speedBeforeDecelerate - 1, bike.getSpeed());
    }

    @Test
    public void speedShouldNeverGoBelowZero() {
        bike.turnOn();
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void gearShouldShiftBackDownWhenSpeedDecreases() {
        bike.turnOn();
        for (int i = 0; i < 41; i++) {
            bike.accelerate();
        }
        assertEquals(1, bike.getGear());

        for (int i = 0; i < 20; i++) {
            bike.decelerate();
        }
        assertEquals(1, bike.getGear());
    }
}
