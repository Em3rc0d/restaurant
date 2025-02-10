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
public class Trabajador extends Usuario{
    private String puesto;
    private float salario;
    private float horasTrabajadas;
}
