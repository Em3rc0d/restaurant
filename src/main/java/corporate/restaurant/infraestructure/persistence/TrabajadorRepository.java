package corporate.restaurant.infraestructure.persistence;

import corporate.restaurant.infraestructure.entity.TrabajadorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import corporate.restaurant.infraestructure.entity.ReservaEntity;

public interface TrabajadorRepository extends MongoRepository<TrabajadorEntity, String> {
    
}
