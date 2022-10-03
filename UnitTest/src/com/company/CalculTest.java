package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculTest {
    int a;
    int b;

        @Before
        public  void Znah(){
            a = 5;
            b = 3;
        }

    @Test
    public  void Testaddition() {
        Assert.assertEquals("Error",8,Calcul.addition(a,b));
    }

    @Test
    public  void Testsubtraction() {
        Assert.assertEquals( "Error", 8 ,Calcul.subtraction(a,b));
    }
}