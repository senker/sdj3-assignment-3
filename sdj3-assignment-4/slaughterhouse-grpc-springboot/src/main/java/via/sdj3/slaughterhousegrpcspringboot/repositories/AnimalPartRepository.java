package via.sdj3.slaughterhousegrpcspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhousegrpcspringboot.models.AnimalPartModel;
import via.sdj3.slaughterhousegrpcspringboot.models.TrayModel;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalPartRepository extends JpaRepository<AnimalPartModel, Long> {
    Optional<List<AnimalPartModel>> findAnimalPartModelsByAnimal_Id(Long animalId);
}
