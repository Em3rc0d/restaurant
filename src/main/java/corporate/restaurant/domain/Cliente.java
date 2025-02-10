package corporate.restaurant.domain;

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
}
