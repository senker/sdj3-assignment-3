using System.Text;
using System.Text.Json;

namespace S3_Ex1;

public class PersonPersistence
{
    public void StoreObjects(List<Person> persons)
    {
        string jsonFormatted = JsonSerializer.Serialize(persons, new JsonSerializerOptions {    WriteIndented = true});
        using StreamWriter sw = new StreamWriter("MyPeople.txt");
        sw.WriteLine(jsonFormatted);
    }

    public string ReadFile()
    {
        StringBuilder sb = new StringBuilder();
        using StreamReader sr = new StreamReader("MyPeople.txt");
        string line;
        while ((line = sr.ReadLine()) != null)
        {
            sb.AppendLine(line);
        }

        return sb.ToString();
    }

    public List<Person> DeserializeObject(string toBeDeserialized)
    {
        using StreamReader sr = new StreamReader("MyPeople.txt");
        List<Person> myObject = JsonSerializer.Deserialize<List<Person>>(toBeDeserialized);
        return myObject;
    }
}