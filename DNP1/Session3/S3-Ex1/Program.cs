// See https://aka.ms/new-console-template for more information

using System.Text.Json;
using S3_Ex1;

Person Vladimir = new Person("Vladimir", "Rotaru", 24, 182, false, 'M', new []{"Gym", "Running"});
Person Arnold = new Person("Arnold", "Schwarznegger", 36, 187, true, 'M', new []{"Movies", "Sport"});
Person Zensen = new Person("Zensen", "Peterson", 46, 173, false, 'M', new []{"Reading", "Meditation"});

List<Person> threeFriends = new List<Person>{ Vladimir, Arnold, Zensen };

string myJson = JsonSerializer.Serialize(threeFriends);

Console.WriteLine(myJson);

string jsonFormatted = JsonSerializer.Serialize(myJson, new JsonSerializerOptions {    WriteIndented = true});

Console.WriteLine(jsonFormatted);