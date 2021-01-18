package com.simple.figures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSquareCalc {

    @Test
    public void testRectangleArea() {
        Square square = new Square( 5);
        Assert.assertEquals(square.calcArea(), 25.0);
    }
}
