namespace S3_Ex1;

public class Person
{
    private string FirstName { get; set; }
    private string LastName { get; set; }
    private int Age { get; set; }
    private double Height { get; set; }
    private bool IsMarried { get; set; }
    private char Sex { get; set; }
    private string[] Hobbies { get; set; }

    public Person(string firstName, string lastName, int age, double height, bool isMarried, char sex, string[] hobbies)
    {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Height = height;
        IsMarried = isMarried;
        Sex = sex;
        Hobbies = hobbies;
    }
}