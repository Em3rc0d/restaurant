package corporate.restaurant.infraestructure.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "clientes")
public class ClienteEntity extends UsuarioEntity {
    
    private String correo;
    private Boolean esFrecuente;

    public ClienteEntity(String id, String nombre, String apellido, String numeroTelefono, String correo, Boolean esFrecuente) {
        super(id, nombre, apellido, numeroTelefono);
        this.correo = correo;
        this.esFrecuente = esFrecuente;
    }
}
