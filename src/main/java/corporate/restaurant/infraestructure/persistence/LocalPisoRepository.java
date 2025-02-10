package corporate.restaurant.infraestructure.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import corporate.restaurant.infraestructure.entity.ReservaEntity;

public interface LocalPisoRepository extends MongoRepository<ReservaEntity, String> {

}
