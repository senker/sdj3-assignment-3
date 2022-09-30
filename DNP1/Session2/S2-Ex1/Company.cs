namespace S2_Ex1;

public class Company
{
    List<Employee> employees;

    public Company()
    {
        this.employees = new List<Employee>();
    }

    public double GetMonthlySalaryTotal()
    { 
        double total = 0;
        foreach (var employee in employees)
        {
            total += employee.GetMonthlySalary();
        }

        return total;
    }

    public void HireNewEmployee(Employee emp)
    {
        employees.Add(emp);
    }
}