package via.sdj3.slaughterhouseapi.repository;

import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhouseapi.model.Animal0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Repository
public class AnimalRepository0 {
    private static final Map<Integer, Animal0> animalMap = new HashMap<>();
    static {
        initDataSource();
    }

    public static Date parseDate(String date) {
        try {
            Calendar cal = Calendar.getInstance();
            Date myDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            cal.setTime(myDate);
            cal.add(Calendar.DATE, 1);
            return cal.getTime();
        } catch (ParseException e) {
            return null;
        }
    }

    private static void initDataSource() {
        Animal0 a1 = new Animal0( parseDate("09-10-2022"), 45.7, 1, "Arla");
        Animal0 a2 = new Animal0( parseDate("09-10-2022"), 66.2, 2, "Arla");
        Animal0 a3 = new Animal0( parseDate("10-10-2022"), 51.9, 3, "Farm");
        Animal0 a4 = new Animal0( parseDate("10-10-2022"), 70.2, 4, "Farm");

        animalMap.put(a1.getRegNumber(), a1);
        animalMap.put(a2.getRegNumber(), a2);
        animalMap.put(a3.getRegNumber(), a3);
        animalMap.put(a4.getRegNumber(), a4);
    }

    // Create
    public Animal0 createAnimal(Animal0 a)
    {
        animalMap.put(a.getRegNumber(), a);
        return a;
    }
    // Get by reg nr
    public Animal0 findByRegNr(Integer regNr)
    {
        return animalMap.get(regNr);
    }
    // Get by origin
    public List<Animal0> findByOrigin(String origin)
    {
        List<Animal0> a = new ArrayList<>();
        for (Animal0 i : animalMap.values())
        {
            if (i.getOrigin().equals(origin))
            {
                a.add(i);
            }
        }
        return a;
    }

    // Get by date
    public List<Animal0> findByDate(String date)
    {
        List<Animal0> a = new ArrayList<>();
        Date toCompare = parseDate(date);
        for (Animal0 i : animalMap.values())
        {
            if (i.getDate().equals(toCompare))
            {
                a.add(i);
            }
        }
        return a;
    }

    // Get all
    public List<Animal0> findAll()
    {
        Collection<Animal0> c = animalMap.values();
        List<Animal0> animalList = new ArrayList<>();
        animalList.addAll(c);
        return animalList;
    }
    // Update
    public Animal0 updateAnimal(Animal0 a)
    {
        animalMap.put(a.getRegNumber(), a);
        return a;
    }
    // Delete
    public void deleteByRegNr(Integer regNr)
    {
        animalMap.remove(regNr);
    }
}
