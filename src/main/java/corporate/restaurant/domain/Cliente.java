package corporate.restaurant.domain;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Data es para que se generen los setter y getter de cada atributo
//NoArgsContructor para crear el constructor vacío
//AllArgsContructor para crear el constructor completo

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Usuario {
    
    private String correo;
    private Boolean esFrecuente;

    public Cliente(String id, String nombre, String apellido, String numeroTelefono, String correo, Boolean esFrecuente) {
        super(id, nombre, apellido, numeroTelefono);
        this.correo = correo;
        this.esFrecuente = esFrecuente;
    }
}
