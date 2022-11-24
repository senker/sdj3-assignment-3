package via.sdj3.slaughterhousegrpcspringboot.client.controllers;

import com.google.protobuf.Descriptors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhousegrpcspringboot.models.AnimalModel;
import via.sdj3.slaughterhousegrpcspringboot.client.services.animalService.AnimalService;

import java.util.Map;

@RestController
@RequestMapping("/")
public class AnimalController0 {
    //private AnimalRepository0 animalRepo;
    AnimalService animalService = new AnimalService();

    public AnimalController0(AnimalService animalService)
    {
        this.animalService = animalService;
    }

    @PostMapping("/animals")  // C endpoint
    @ResponseBody
    public ResponseEntity<Object> createAnimal(@RequestBody AnimalModel animal) {
        try{
            Map<Descriptors.FieldDescriptor, Object> animalResponse = animalService.createAnimal(animal);
            return new ResponseEntity<Object>(animalResponse, HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    /*@GetMapping("/animals")  // R endpoint
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
    }*/
}
