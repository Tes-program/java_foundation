package Day5;

import Day5.Assignment.AirConditioner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    private AirConditioner airConditioner;

    @BeforeEach
    public void setUp() {
        airConditioner = new AirConditioner();
    }

    @Test
    public void airConditionerShouldBeOffByDefault() {
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void airConditionerShouldToggleOn() {
        airConditioner.togglePower();
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void airConditionerShouldToggleOff() {
        airConditioner.togglePower();
        airConditioner.togglePower();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void airConditionerShouldStartAtSixteenDegrees() {
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void airConditionerShouldNotIncreaseTemperatureWhenOff() {
        airConditioner.increaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void airConditionerShouldNotDecreaseTemperatureWhenOff() {
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void airConditionerShouldIncreaseTemperatureWhenOn() {
        airConditioner.togglePower();
        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }

    @Test
    public void airConditionerShouldDecreaseTemperatureWhenOn() {
        airConditioner.togglePower();
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void airConditionerTemperatureShouldNotGoAboveThirty() {
        airConditioner.togglePower();
        for (int i = 0; i < 20; i++) {
            airConditioner.increaseTemperature();
        }
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void airConditionerTemperatureShouldNotGoBelowSixteen() {
        airConditioner.togglePower();
        airConditioner.setTemperature(16);
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void airConditionerShouldResetTemperatureToSixteen() {
        airConditioner.togglePower();
        airConditioner.setTemperature(25);
        airConditioner.resetTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }
}
