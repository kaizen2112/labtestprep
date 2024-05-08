package com.example.labtestprep;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

    @Test
    public void area() {
        Square s = new Square(5);
        assertEquals(25.0, s.area(),0.0);
    }

    @Test
    public void perimeter() {
        Square s = new Square(5);
        assertEquals(20.0, s.perimeter(),0.0);
    }
}