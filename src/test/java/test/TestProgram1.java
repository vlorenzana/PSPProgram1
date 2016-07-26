/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import psp.demo.pspprogram1.Program1;

/**
 *
 * @author victor.lorenzana
 */

public class TestProgram1 {

    
    
    
    @Test
    public void testAVG0()
    {
        List<Double> values=new ArrayList<>();
        values.add(5d);
        values.add(5d);
        double res=Program1.avg(values);
        org.junit.Assert.assertEquals(res, 5d,0.0d);
    }
    @Test
    public void testAVG1()
    {
        List<Double> values=new ArrayList<>();
        values.add(4d);
        values.add(0d);
        double res=Program1.avg(values);
        org.junit.Assert.assertEquals(res, 2d,0.0d);
    }
    @Test
    public void testAVG2()
    {
        List<Double> values=new ArrayList<>();
       
        double res=Program1.avg(values);
        org.junit.Assert.assertEquals(res, 2d,0.0d);
    }
}
