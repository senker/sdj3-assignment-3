namespace S2_Ex3;

public class Car
{
    private string Brand { get; set; }
    private string Color { get; set; }
    private double EngineSize { get; set; }
    private double FuelEconomy { get; set; }
    private bool IsManualShift { get; set; }

    public Car(string brand, string color, double engineSize, double fuelEconomy, bool isManualShift)
    {
        Brand = brand;
        Color = color;
        EngineSize = engineSize;
        FuelEconomy = fuelEconomy;
        IsManualShift = isManualShift;
    }

    public void FindCarByColor(List<Car> garaj, string color)
    {
        var localGaraj = garaj.FindAll(car => car.Color.Equals("Blue"));
        foreach (var car in localGaraj)
        {
            Console.WriteLine(car.ToString());
        }
    }
    
    public void FindCarByTwoColor(List<Car> garaj, string color1, string color2)
    {
        var localGaraj = garaj.FindAll(car => car.Color.Equals(color1) || car.Color.Equals(color2));
        foreach (var car in localGaraj)
        {
            Console.WriteLine(car.ToString());
        }
    }
    
    override 
    public string ToString()
    {
        return "Car brand: " + Brand + ", Car color: " + Color + " EngineSize: " + EngineSize + " FuelEconomy: " +
               FuelEconomy + "/100km Manual Shift: " + IsManualShift;
    }
}