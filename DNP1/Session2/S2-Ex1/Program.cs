// See https://aka.ms/new-console-template for more information

using S2_Ex1;

Company carnateni = new Company();
Employee vasily = new FullTimeEmployee("Vasily", 45000);
Employee anton = new PartTimeEmployee("Anton", 155, 63);
carnateni.HireNewEmployee(vasily);
carnateni.HireNewEmployee(anton);
Console.WriteLine(carnateni.GetMonthlySalaryTotal());