package corporate.restaurant.infraestructure.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "mesas")
public class MesaEntity {
    @MongoId
    private String id;
    private LocalPisoEntity localPiso;
    private int cantidadPersonas;
    private Boolean estaDisponible;
}
