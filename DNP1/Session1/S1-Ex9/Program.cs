
void nTwice(string a, int n)
{
    Console.WriteLine(a.Substring(0, n) + a.Substring(a.Length-n, n));
}

nTwice("Vladimir", 2);