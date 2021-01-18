package com.simple.figures;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRectangleCalc {

    @Test
    public void testRectangleArea() {
        Rectangle rect = new Rectangle(4, 5);
        Assert.assertEquals(rect.calcArea(), 20.0);
    }

}
