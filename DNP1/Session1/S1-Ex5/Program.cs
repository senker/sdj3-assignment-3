using S1_Ex5.MathLib;

var calc = new Calculator();
Console.WriteLine(calc.Add(5, 8));
int[] x = {5, 6, 8, 2};
Console.WriteLine(calc.Add(x));

Console.WriteLine("Input your first number: ");
var a = Console.ReadLine();
Console.WriteLine("Input your second number: ");
var b = Console.ReadLine();
Console.WriteLine(calc.GreaterInteger(Convert.ToInt32(a), Convert.ToInt32(b)));
