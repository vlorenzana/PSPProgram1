/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.demo.pspprogram1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor.lorenzana
 */
public interface Program1 {

    public static double avg(List<Double> values) {
        double sum = 0;
        if (!values.isEmpty()) {
            for (Double value : values) {
                sum += value;
            }
            return sum / values.size();
        } else {
            return 0;
        }
    }

    public static double desv(List<Double> values) {
        if (values.isEmpty()) {
            return 0;
        }
        double avg = avg(values);
        double suma = 0;
        for (Double value : values) {
            suma += Math.pow(value - avg, 2);
        }
        return Math.sqrt(suma / (values.size() - 1));
    }

    public static List<Double> loadData(File file) {
        List<Double> list = new ArrayList<>();
        if (file.exists()) {
            try {
                BufferedReader in = new BufferedReader(new FileReader(file));
                try {
                    String line = in.readLine();
                    line=line.isEmpty() ? null : line;
                    while (line != null) {
                        double data = Double.parseDouble(line);
                        list.add(data);
                        try {
                            line = in.readLine();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
            }
        }
        return list;
    }
}
