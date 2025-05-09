package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Part;

public class PartTest {

    @Test
    public void testInventoryAboveMax() {
        Part testPart = new Part(1, "Motherboard", 120.0, 15, 1, 10);
        boolean isValid = testPart.getStock() <= testPart.getMax();
        assertFalse(isValid, "Inventory should not be valid if above max.");
    }

    @Test
    public void testInventoryBelowMin() {
        Part testPart = new Part(2, "RAM", 80.0, 1, 5, 20);
        boolean isValid = testPart.getStock() >= testPart.getMin();
        assertFalse(isValid, "Inventory should not be valid if below min.");
    }
}
