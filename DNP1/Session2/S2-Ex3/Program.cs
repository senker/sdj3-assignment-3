// See https://aka.ms/new-console-template for more information

using S2_Ex3;

Car bmw = new Car("E60", "Dark green", 3.0, 7.9, true);
Car audi = new Car("RS6", "Blue", 4.4, 12.9, false);
Car vokswagen = new Car("Passat", "Red", 2.0, 6.3, false);
Car mazda = new Car("RX8", "Pink", 2.3, 9.9, true);
Car skoda = new Car("Fabia", "Blue", 4.4, 3.9, true);

List<Car> Garaj = new List<Car>{ bmw, audi, vokswagen, mazda, skoda};

bmw.FindCarByTwoColor(Garaj, "Blue", "Red");