void StringManipulation(string outer, string b)
{
    Console.WriteLine(outer.Substring(0, 2) + b + outer.Substring(2,2));
}

StringManipulation("<<>>", "Vladimir");