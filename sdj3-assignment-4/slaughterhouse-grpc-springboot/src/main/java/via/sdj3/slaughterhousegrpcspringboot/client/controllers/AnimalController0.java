package via.sdj3.slaughterhousegrpcspringboot.client.controllers;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhousegrpcspringboot.models.AnimalModel;
import via.sdj3.slaughterhousegrpcspringboot.client.services.animalService.AnimalService;
import via.sdj3.slaughterhousegrpcspringboot.models.ProductPackModel;
import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalController0 {
    AnimalService animalService = new AnimalService();

    public AnimalController0(AnimalService animalService)
    {
        this.animalService = animalService;
    }

    @PostMapping("/animals")  // C endpoint
    @ResponseBody
    public AnimalModel createAnimal(@RequestBody AnimalModel animal) {
        return animalService.createAnimal(animal);
    }

    @GetMapping("/animals/{regNr}")  // R endpoint
    @ResponseBody
    public AnimalModel getAnimalByRegNr(@PathVariable Integer regNr) {
        return animalService.findByRegNr(regNr);
    }

    @PutMapping("/animals/{regNr}")  // U endpoint
    public AnimalModel updateAnimal(@PathVariable Integer regNr, @RequestBody AnimalModel animal) {
        animal.setId((long) regNr);

        return animalService.updateAnimal(animal);
    }

    @GetMapping("/animals")  // R endpoint
    @ResponseBody
    public List<AnimalModel> getAnimals(
            @RequestParam(required = false, value = "date") String date,
            @RequestParam(required = false, value = "origin") String origin
    ) {
        if(date != null)
        {
            return animalService.findByDate(date);
        }

        if(origin != null)
        {
            return animalService.findByOrigin(origin);
        }

        List<AnimalModel> list = animalService.findAll();
        return list;
    }

    @DeleteMapping("/animals/{regNr}")  // D endpoint
    public String deleteAnimal(@PathVariable Integer regNr) {
        animalService.deleteByRegNr(regNr);
        return "Animal deleted";
    }

    @GetMapping("/animals/product/{productId}")  // R endpoint
    @ResponseBody
    public List<AnimalModel> getAllAnimalRegNrInProduct(@PathVariable Integer productId) {
        return animalService.getAllAnimalRegNrInProduct(productId);
    }

        @GetMapping("/animals/productFromAnimal/{animalId}")  // R endpoint
    @ResponseBody
    public List<ProductPackModel> getAllProductFromAnimal(@PathVariable Integer animalId) {
        return animalService.getAllProductFromAnimal(animalId);
    }
}
