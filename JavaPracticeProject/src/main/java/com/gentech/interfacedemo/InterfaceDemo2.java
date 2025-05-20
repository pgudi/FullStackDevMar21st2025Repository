package com.gentech.interfacedemo;
// if interface contains static methods
interface TwoWheelers
{
    void engine();
    static void fuelTypeConsumption(String fuelType)
    {
        System.out.println("The Vehicle is consuming fuel as :"+fuelType);
    }
}
class SplendorPlus implements TwoWheelers
{
    public void engine()
    {
        System.out.println("This Engine works based on fuel Petrol");
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        SplendorPlus obj=new SplendorPlus();
        obj.engine();
        TwoWheelers.fuelTypeConsumption("Petrol");
    }
}
