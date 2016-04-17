package com.machnovets.tpo.lr2.Dummies;

import com.machnovets.tpo.lr2.ITrigonometry;

import java.util.Map;

/**
 * Created by bilde_000 on 18.04.2016.
 */
public class TrigDummies extends Dummies implements ITrigonometry {
    private Map<Double, Double> sinMap;
    private Map<Double, Double> cosMap;
    private Map<Double, Double> cotMap;
    private Map<Double, Double> secMap;
    private Map<Double, Double> tanMap;

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
        return sinMap.get(x);
    }

    public double cos(double x, double accuracy)
    {
        return cosMap.get(x);
    }

    public double cot(double x, double accuracy)
    {
        return cotMap.get(x);
    }

    public double sec(double x, double accuracy)
    {
        return secMap.get(x);
    }

    public double tan(double x, double accuracy)
    {
        return tanMap.get(x);
    }


}
