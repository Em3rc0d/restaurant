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
@Document(collection = "trabajadores")
public class TrabajadorEntity {

    @MongoId
    private String id;
    private String puesto;
    private float salario;
}
