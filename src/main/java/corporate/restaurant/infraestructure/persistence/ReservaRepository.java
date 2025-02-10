package corporate.restaurant.infraestructure.persistence;

import corporate.restaurant.infraestructure.entity.ReservaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends MongoRepository<ReservaEntity, String> {
}
