package com.machnovets.tpo.lr2.Dummies;

import com.machnovets.tpo.lr2.ITrigonometry;

import java.util.Map;

/**
 * Created by bilde_000 on 18.04.2016.
 */
public class TrigDummies extends Dummies implements ITrigonometry {
    private Map<String, Double> sinMap;
    private Map<String, Double> cosMap;
    private Map<String, Double> cotMap;
    private Map<String, Double> secMap;
    private Map<String, Double> tanMap;

    public TrigDummies() {
        sinMap = readValues("sin.csv");
        cosMap = readValues("cos.csv");
        cotMap = readValues("cot.csv");
        secMap = readValues("sec.csv");
        tanMap = readValues("tan.csv");
        System.out.println();
    }

    public double sin(double x, double accuracy)
    {
        return sinMap.get(String.format("%.2f",x));
    }

    public double cos(double x, double accuracy)
    {
        return cosMap.get(String.format("%.2f",x));
    }

    public double cot(double x, double accuracy)
    {
        return cotMap.get(String.format("%.2f",x));
    }

    public double sec(double x, double accuracy)
    {
        return secMap.get(String.format("%.2f",x));
    }

    public double tan(double x, double accuracy)
    {
        return tanMap.get(String.format("%.2f",x));
    }


}
