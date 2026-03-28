package Day5;

import Day5.Assignment.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    private Television television;

    @BeforeEach
    public void setUp() {
        television = new Television();
    }

    @Test
    public void televisionShouldTurnOn() {
        television.turnOn();
        assertTrue(television.isOn());
    }

    @Test
    public void televisionShouldTurnOff() {
        television.turnOn();
        television.turnOff();
        assertFalse(television.isOn());
    }

    @Test
    public void televisionShouldStartOnChannelOne() {
        assertEquals(1, television.getChannel());
    }

    @Test
    public void televisionShouldStartWithVolumeTen() {
        assertEquals(10, television.getVolume());
    }

    @Test
    public void televisionShouldNotChangeChannelWhenOff() {
        television.channelUp();
        assertEquals(1, television.getChannel());
    }

    @Test
    public void televisionShouldNotChangeVolumeWhenOff() {
        television.volumeUp();
        assertEquals(10, television.getVolume());
    }

    @Test
    public void televisionShouldIncreaseChannelWhenOn() {
        television.turnOn();
        television.channelUp();
        assertEquals(2, television.getChannel());
    }

    @Test
    public void televisionShouldDecreaseChannelWhenOn() {
        television.turnOn();
        television.channelUp();
        television.channelDown();
        assertEquals(1, television.getChannel());
    }

    @Test
    public void televisionChannelShouldNotGoBelowOne() {
        television.turnOn();
        television.channelDown();
        assertEquals(1, television.getChannel());
    }

    @Test
    public void televisionChannelShouldNotGoAboveHundred() {
        television.turnOn();
        for (int i = 0; i < 200; i++) {
            television.channelUp();
        }
        assertEquals(100, television.getChannel());
    }

    @Test
    public void televisionShouldIncreaseVolumeWhenOn() {
        television.turnOn();
        television.volumeUp();
        assertEquals(11, television.getVolume());
    }

    @Test
    public void televisionShouldDecreaseVolumeWhenOn() {
        television.turnOn();
        television.volumeDown();
        assertEquals(9, television.getVolume());
    }

    @Test
    public void televisionVolumeShouldNotGoBelowZero() {
        television.turnOn();
        for (int i = 0; i < 20; i++) {
            television.volumeDown();
        }
        assertEquals(0, television.getVolume());
    }

    @Test
    public void televisionVolumeShouldNotGoAboveHundred() {
        television.turnOn();
        for (int i = 0; i < 200; i++) {
            television.volumeUp();
        }
        assertEquals(100, television.getVolume());
    }

    @Test
    public void televisionShouldMute() {
        television.turnOn();
        television.mute();
        assertTrue(television.isMuted());
        assertEquals(0, television.getVolume());
    }

    @Test
    public void televisionShouldUnmute() {
        television.turnOn();
        television.volumeUp();
        television.mute();
        television.unmute();
        assertFalse(television.isMuted());
        assertEquals(11, television.getVolume());
    }

    @Test
    public void televisionShouldResetWhenTurnedOff() {
        television.turnOn();
        television.channelUp();
        television.volumeUp();
        television.mute();
        television.turnOff();

        assertFalse(television.isOn());
        assertEquals(1, television.getChannel());
        assertEquals(10, television.getVolume());
        assertFalse(television.isMuted());
    }
}