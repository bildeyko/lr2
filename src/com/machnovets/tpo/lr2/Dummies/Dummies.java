package com.machnovets.tpo.lr2.Dummies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bilde_000 on 18.04.2016.
 */
public class Dummies {

    protected Map<Double, Double> readValues(String filename)
    {
        Map<Double, Double> map = new HashMap<>();
        try(FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr))
        {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                map.put(Double.parseDouble(parts[0].replace(',','.')), Double.parseDouble(parts[1].replace(',','.')));
            }
        } catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
        return map;
    }
}
