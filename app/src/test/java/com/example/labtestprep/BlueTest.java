package com.example.labtestprep;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlueTest {

    @Test
    public void showcolor() {
        Blue b = new Blue();
        assertEquals("Blue", b.showcolor());
    }
}