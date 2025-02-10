package corporate.restaurant.infraestructure.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "usuarios")
public class UsuarioEntity {
    
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String numeroTelefono;
}
