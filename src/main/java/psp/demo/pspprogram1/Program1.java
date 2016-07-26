/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.demo.pspprogram1;

import java.util.List;

/**
 *
 * @author victor.lorenzana
 */
public class Program1 {

    public static double avg(List<Double> values) {
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        return sum / values.size();
    }
    
    public static double desv(List<Double> values)
    {
        double avg=avg(values);
        double suma=0;
        for(Double value : values)
        {
            suma+=Math.pow(value-avg,2);
        }
        return suma/values.size();
    }
}
