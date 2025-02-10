package corporate.restaurant.infraestructure.entity;

import java.util.Date;

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
@Document(collection = "sedes")
public class SedeEntity {
    @MongoId
    private String id;
    private String nombre;
    private String direccion;
    private TrabajadorEntity trabajador[];
}
