import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTestApp
{
    private Vehicle vehicle = new Vehicle("Red");

    @Test
    public void getColour()
    {
        vehicle.setColour("Blue");
        String output = vehicle.getColour();
        assertEquals("Blue", output);
    }

    @Test
    public void testGetMake()
    {
        Sedan sedan = new Sedan(vehicle.getColour(), "BMW", 2013);
        String output = sedan.getColour();
        assertSame("Red", output);
    }

    @Test
    public void testIsServiced()
    {
        assertFalse(vehicle.isServiced());
    }

    @Test
    public void testRandom()
    {
        Vehicle v = new Sedan("Red", "BMW", 2013);
    }

}