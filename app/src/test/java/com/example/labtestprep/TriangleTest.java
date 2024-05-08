package com.example.labtestprep;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void area() {
        Triangle t = new Triangle(3,4,5);
        assertEquals(6.0, t.area(),0.0);
    }

    @Test
    public void perimeter() {
        Triangle t = new Triangle(3,4,5);
        assertEquals(12.0, t.perimeter(),0.0);
    }
}