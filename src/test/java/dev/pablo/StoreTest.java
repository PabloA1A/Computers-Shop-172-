package dev.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {
    private Store store;
    private Computer computer1;
    private Computer computer2;

    @BeforeEach
    void setUp() {
        store = new Store("My Store", "Pablo", "123456", new ArrayList<>());
        computer1 = new Computer("Apple", 16, "M1", "macOS", 999.99);
        computer2 = new Computer("Dell", 8, "i7", "Windows", 799.99);
    }

    @Test
    public void testGetName() {
        assertEquals("My Store", store.getName());
    }

    @Test
    public void testSetName() {
        store.setName("New Tienda");
        assertEquals("New Tienda", store.getName());
    }

    @Test
    public void testGetOwner() {
        assertEquals("Pablo", store.getOwner());
    }

    @Test
    public void testSetOwner() {
        store.setOwner("Juan");
        assertEquals("Juan", store.getOwner());
    }

    @Test
    public void testGetTaxId() {
        assertEquals("123456", store.getTaxId());
    }

    @Test
    public void testSetTaxId() {
        store.setTaxId("987654");
        assertEquals("987654", store.getTaxId());
    }

    @Test
    public void testGetComputers() {
        assertTrue(store.getComputers().isEmpty());
    }

    @Test
    public void testSetComputers() {
        List<Computer> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        store.setComputers(computers);
        assertEquals(computers, store.getComputers());
    }

    @Test
    void testAddComputer() {
        store.addComputer(computer1);
        assertEquals(1, store.listComputers().size());
        assertTrue(store.listComputers().contains(computer1));
    }

    @Test
    void testRemoveComputer() {
        store.addComputer(computer1);
        store.addComputer(computer2);
        assertTrue(store.removeComputer("Apple"));
        assertEquals(1, store.listComputers().size());
        assertFalse(store.listComputers().contains(computer1));
    }

    @Test
    void testFindComputer() {
        store.addComputer(computer1);
        store.addComputer(computer2);
        assertEquals(computer1, store.findComputer("Apple"));
        assertNull(store.findComputer("Lenovo"));
    }

    @Test
    void testListComputer() {
        store.addComputer(computer1);
        store.addComputer(computer2);
        List<Computer> computerList = store.listComputers();
        assertEquals(2, computerList.size());
        assertTrue(computerList.contains(computer1));
        assertTrue(computerList.contains(computer2));
    }
}