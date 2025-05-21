package com.gentech.interfacedemo;
// if interface contains default methods
interface FourWheelers
{
    void engine();
    default void fuelTypeConsumption(String fuelType)
    {
        System.out.println("The Vehicle is consuming fuel as :"+fuelType);
    }
}

class TataNexon implements FourWheelers
{
    public void engine()
    {
        System.out.println("This Engine works based on fuel Petrol");
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        TataNexon o=new TataNexon();
        o.engine();
        o.fuelTypeConsumption("Petrol");
    }
}
