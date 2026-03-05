package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    CustomList list;
    City city;

    @BeforeEach
    public void beforeEach() {
        list = new CustomList();
        city = new City("Calgary", "AB");
        list.addCity(city);
    }

    @Test
    public void testHasCity() {
        assertTrue(list.hasCity(city));
    }

    @Test
    public void testDeleteCity() {
        assertTrue(list.deleteCity(city));
    }
}
