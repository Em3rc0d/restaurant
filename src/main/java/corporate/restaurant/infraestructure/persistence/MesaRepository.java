package corporate.restaurant.infraestructure.persistence;

import corporate.restaurant.infraestructure.entity.MesaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MesaRepository extends MongoRepository<MesaEntity, String> {
}
