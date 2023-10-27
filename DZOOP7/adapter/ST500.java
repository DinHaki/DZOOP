package DZOOP7.adapter;

import java.util.Random;

public class ST500 implements SensorTemperature{

    private static Random random = new Random();
    private int id;

    {
        id = random.nextInt(9999);
    }


    @Override
    public int getIdentifier() {
        return id;
    }

    @Override
    public double temperature() {
        return 22;
    }
}