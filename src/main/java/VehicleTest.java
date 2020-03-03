public class VehicleTest
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle("Red");
        Sedan sedan  = new Sedan(vehicle.getColour(), "Mercedes", 2012);

        System.out.println(vehicle.toString());

        vehicle.Price();
        System.out.println(sedan.toString());
        sedan.Price();
    }
}
