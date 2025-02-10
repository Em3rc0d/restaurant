package corporate.restaurant.infraestructure.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import corporate.restaurant.infraestructure.entity.ReservaEntity;

public interface TrabajadorRepository extends MongoRepository<ReservaEntity, String> {
    
}
