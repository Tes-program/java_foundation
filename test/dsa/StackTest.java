package dsa;

import Day3.dsa.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack strings;

    @BeforeEach
    public void setUp() {
        strings = new Stack();
    }

    @Test
    @DisplayName("Stack should be empty")
    public void newStack_isEmptyTest() {
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addElement_stackIsNotEmptyTest() {
        assertTrue(strings.isEmpty());
        strings.push("G-strings");
        assertFalse(strings.isEmpty());
    }

    @Test
    public void pushOneElement_popOneElement_StackIsEmptyTest() {
        strings.push("strings");
        assertFalse(strings.isEmpty());

        String popped = strings.pop();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void pushOneElement_popOneElement_stackIsNotEmptyTest() {
        strings.push("G-strings");
        strings.push("A-strings");
        assertFalse(strings.isEmpty());

        String popped = strings.pop();
        assertFalse(strings.isEmpty());
    }

    @Test
    public void pushX_popReturnsXTest () {
        strings.push("G-strings");
        assertEquals("G-strings", strings.pop());
    }

    @Test
    public void pushXYZ_popReturnsXYZTest () {
        strings.push("G-strings");
        strings.push("A-strings");
        strings.push("D-strings");
        assertEquals("D-strings", strings.pop());
        assertEquals("A-strings", strings.pop());
        assertEquals("G-strings", strings.pop());

    }
}
