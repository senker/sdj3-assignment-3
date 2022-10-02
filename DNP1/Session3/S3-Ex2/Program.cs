// See https://aka.ms/new-console-template for more information

using S3_Ex1;

Person Vladimir = new Person("Vladimir", "Rotaru", 24, 182, false, 'M', new []{"Gym", "Running"});
Person Arnold = new Person("Arnold", "Schwarznegger", 36, 187, true, 'M', new []{"Movies", "Sport"});
Person Zensen = new Person("Zensen", "Peterson", 46, 173, false, 'M', new []{"Reading", "Meditation"});

List<Person> threeFriends = new List<Person>{ Vladimir, Arnold, Zensen };
PersonPersistence storage = new PersonPersistence();

storage.StoreObjects(threeFriends);

Console.WriteLine(storage.ReadFile());

Console.WriteLine("Deserialized string");
Console.WriteLine("Deserialized string");
Console.WriteLine("Deserialized string");
List<Person> deserializeObject = storage.DeserializeObject(storage.ReadFile());
foreach (var person in deserializeObject)
{
    Console.WriteLine(person.ToString());
}

