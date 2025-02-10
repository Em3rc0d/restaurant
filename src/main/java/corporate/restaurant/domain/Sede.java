package corporate.restaurant.domain;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Data es para que se generen los setter y getter de cada atributo
//NoArgsContructor para crear el constructor vacío
//AllArgsContructor para crear el constructor completo
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sede {
    @Id
    private String id;
    private String ciudad;
    private String distrito;
    private String direccion;
    private Trabajador trabajador[];
}
