namespace S2_Ex1;

public class FullTimeEmployee : Employee
{
    public double MonthlySalary { get; set; }

    public override double GetMonthlySalary()
    {
        return MonthlySalary;
    }

    public FullTimeEmployee(string name, double monthlySalary) : base(name)
    {
        MonthlySalary = monthlySalary;
    }
}