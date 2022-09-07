namespace S1_Ex5.MathLib;

public class Calculator
{
    public int Add(int x, int y)
    {
        return x + y;
    }

    public int Add(int[] x)
    {
        return x.Sum();
    }

    public int GreaterInteger(int x, int y)
    {
        return x > y ? x : y;
    }
}