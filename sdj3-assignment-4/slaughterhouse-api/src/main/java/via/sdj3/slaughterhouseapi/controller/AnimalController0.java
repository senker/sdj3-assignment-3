package via.sdj3.slaughterhouseapi.controller;

import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouseapi.model.Animal0;
import via.sdj3.slaughterhouseapi.repository.AnimalRepository0;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalController0 {
    private AnimalRepository0 animalRepo;

    public AnimalController0(AnimalRepository0 animalRepo)
    {
        this.animalRepo = animalRepo;
    }

    @PostMapping("/animals")  // C endpoint
    @ResponseBody
    public Animal0 createAnimal(@RequestBody Animal0 animal) {
        return animalRepo.createAnimal(animal);
    }

    @GetMapping("/animals")  // R endpoint
    @ResponseBody
    public List<Animal0> getAnimals(
            @RequestParam(required = false, value = "date") String date,
            @RequestParam(required = false, value = "origin") String origin
    ) {
        if(date != null)
        {
            return animalRepo.findByDate(date);
        }

        if(origin != null)
        {
            return animalRepo.findByOrigin(origin);
        }

        List<Animal0> list = animalRepo.findAll();
        return list;
    }

    @GetMapping("/animals/{regNr}")  // R endpoint
    @ResponseBody
    public Animal0 getAnimalByRegNr(@PathVariable Integer regNr) {
        return animalRepo.findByRegNr(regNr);
    }

    @PutMapping("/animals/{regNr}")  // U endpoint
    public Animal0 updateAnimal(@PathVariable Integer regNr, @RequestBody Animal0 animal) {
        animal.setRegNumber(regNr);
        return animalRepo.updateAnimal(animal);
    }

    @DeleteMapping("/animals/{regNr}")  // D endpoint
    public String deleteAnimal(@PathVariable Integer regNr) {
        animalRepo.deleteByRegNr(regNr);
        return "Animal deleted";
    }
}
