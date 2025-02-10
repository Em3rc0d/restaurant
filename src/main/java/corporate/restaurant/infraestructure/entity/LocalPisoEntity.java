package corporate.restaurant.infraestructure.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "localPiso")
public class LocalPisoEntity {

    @MongoId
    private String id;
    private SedeEntity sede;
    private int numeroPiso;
    private int cantidadMesas;

}
