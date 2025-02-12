package corporate.restaurant.infraestructure.persistence;

import corporate.restaurant.infraestructure.entity.ClienteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {
}
