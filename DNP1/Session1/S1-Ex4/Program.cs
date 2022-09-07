// See https://aka.ms/new-console-template for more information

void PrintEvenNumbersUntilX(int x)
{
    for ( var i = 1; i <= x; i++)
    {
        if (i % 2 == 0)
        {
            Console.Write(i + " ");
        }
    }
}

void PrintUnevenNumbersUntilX(int x)
{
    for (var i = 0; i <= x; i++)
    {
        if (i % 2 != 0)
        {
            Console.Write(i + " ");
        }
    }
}

void DivisibleByY(int x, int y)
{
    for (var i = 0; i <= x; i++)
    {
        if (i % y == 0)
        {
            Console.Write(i + " ");
        }
    }
}
Console.WriteLine("Even numbers: ");
PrintEvenNumbersUntilX(29);
Console.WriteLine("\nUneven numbers: ");
PrintUnevenNumbersUntilX(29);
Console.WriteLine("\nDivided by chosen number: ");
DivisibleByY(29, 5);
