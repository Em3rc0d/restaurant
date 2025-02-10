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
public class LocalPiso {
    @Id
    private String id;
    private Sede sede;
    private int numeroPiso;
    private int cantidadMesas;

    public LocalPiso(String id){
        this.id = id;
    }
}
