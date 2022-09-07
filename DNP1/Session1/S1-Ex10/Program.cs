int BiggestDifference(int[] x)
{
   return x.Max() - x.Min();
}

int[] a = {4, 7, 22, 10};

Console.WriteLine(BiggestDifference(a));