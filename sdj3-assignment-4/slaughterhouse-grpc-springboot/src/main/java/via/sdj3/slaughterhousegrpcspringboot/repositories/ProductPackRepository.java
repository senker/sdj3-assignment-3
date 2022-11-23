package via.sdj3.slaughterhousegrpcspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhousegrpcspringboot.models.ProductPackModel;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductPackRepository extends JpaRepository<ProductPackModel, Long> {
//    List<ProductPackModel> findProductPackModelsBy
//    Optional<List<ProductPackModel>> findProductPackModelBy
}
