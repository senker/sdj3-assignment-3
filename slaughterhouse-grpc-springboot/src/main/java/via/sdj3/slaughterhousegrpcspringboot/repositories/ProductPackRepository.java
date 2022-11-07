package via.sdj3.slaughterhousegrpcspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhousegrpcspringboot.models.ProductPackModel;

@Repository
public interface ProductPackRepository extends JpaRepository<ProductPackModel, Long> { }
