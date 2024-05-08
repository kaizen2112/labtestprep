package com.example.labtestprep;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

    @Test
    public void area() {
        Circle c = new Circle(5);
        assertEquals(Math.PI*5*5, c.area(),0.0);
    }

    @Test
    public void perimeter() {
        Circle c = new Circle(5);
        assertEquals(2*Math.PI*5, c.perimeter(),0.0);
    }
}