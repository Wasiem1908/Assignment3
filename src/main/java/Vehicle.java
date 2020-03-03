public class Vehicle implements Price
{
    private String colour;
    private boolean serviced = false;



    public Vehicle(String colour)
    {
        this.colour =  colour;
    }
    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public boolean isServiced()
    {
        return serviced;
    }

    @Override
    public String toString()
    {
        return "Vehicle \n " + "Colour:" + colour;
    }

    @Override
    public void Price()
    {
        System.out.println("Price: R20 000 ");
    }
}
