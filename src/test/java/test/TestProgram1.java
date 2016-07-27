/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import psp.demo.pspprogram1.Program1;

/**
 *
 * @author victor.lorenzana
 */

public class TestProgram1 {

    static final List<Double> test1=new ArrayList<>();
    static
    {
        test1.add(160d);
        test1.add(591d);
        test1.add(114d);
        test1.add(229d);
        test1.add(230d);
        test1.add(270d);
        test1.add(128d);
        test1.add(1657d);
        test1.add(624d);
        test1.add(1503d);
        
       /* 15.0
 69.9
 6.5
 22.4
 28.4
 65.9
 19.4
 198.7
 38.8
 138.2*/
    }
    
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
        org.junit.Assert.assertEquals(res, 0d,0.0d);
    }
    @Test
    public void testAVGList()
    {
        
       
        double res=Program1.avg(test1);
        org.junit.Assert.assertEquals(res, 550.6d,0.0d);
    }
    @Test
    public void testDesvList()
    {     
       
        double res=Program1.desv(test1);
        org.junit.Assert.assertEquals(res, 572.03d,0.01d);
    }
    @Test
    public void testDesvEmptyList()
    {     
       
        double res=Program1.desv(new ArrayList<>());
        org.junit.Assert.assertEquals(res, 0d,0.01d);
    }
    @Test
    public void testLoadData()
    {     
        String path=Program1.class.getResource("/lista.txt").getFile();
        File file=new File(path);
        
        List<Double> list=Program1.loadData(file);
        assertEquals(10,list.size());
    }
}
