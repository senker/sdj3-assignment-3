int ArrayClumps(int[] a)
{
    int count = 0;
    for (var i = 0; i < a.Length; i++)
    {
        if (a.Length > i + 1)
        {
            if (a[i] == a[i + 1])
            {
                count++;
            } 
        }
    }
    return count;
}

int[] b = {1, 2, 3, 4, 4, 5, 5, 2, 2};

Console.WriteLine(ArrayClumps(b));