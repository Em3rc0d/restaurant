package corporate.restaurant.infraestructure.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "reservas")
public class ReservaEntity {
    @MongoId
    private String id;
    private String clienteId;  // Referencia al cliente en MongoDB
    private String mesaId;     // Referencia a la mesa en MongoDB
    private int cantidadPersonas;
    private Date fecha;
}
