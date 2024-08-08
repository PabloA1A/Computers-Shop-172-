package dev.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    private Computer computer;

    @BeforeEach
    void setUp() {
        computer = new Computer("Apple", 16, "M1", "macOS", 999.99);
    }

    @Test
    void testGetBrand() {
        assertEquals("Apple", computer.getBrand());
    }

    @Test
    void testSetBrand() {
        computer.setBrand("Dell");
        assertEquals("Dell", computer.getBrand());
    }

    @Test
    void testGetMemory() {
        assertEquals(16, computer.getMemory());
    }

    @Test
    void testSetMemory() {
        computer.setMemory(8);
        assertEquals(8, computer.getMemory());
    }

    @Test
    void testGetProcessor() {
        assertEquals("M1", computer.getProcessor());
    }

    @Test
    void testSetProcessor() {
        computer.setProcessor("i7");
        assertEquals("i7", computer.getProcessor());
    }

    @Test
    void testGetOperationSystem() {
        assertEquals("macOS", computer.getOperatingSystem());
    }

    @Test
    void testSetOperationSystem() {
        computer.setOperatingSystem("Windows");
        assertEquals("Windows", computer.getOperatingSystem());
    }

    @Test
    void testGetPrince() {
        assertEquals(999.99, computer.getPrice());
    }

    @Test
    void testSetPrice() {
        computer.setPrice(799.99);
        assertEquals(799.99, computer.getPrice());
    }
}