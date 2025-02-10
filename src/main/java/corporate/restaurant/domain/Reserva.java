package corporate.restaurant.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Data es para que se generen los setter y getter de cada atributo
//NoArgsContructor para crear el constructor vacío
//AllArgsContructor para crear el constructor completo
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    private Cliente cliente;
    private Mesa mesa;
    private int cantidadPersonas;
    private Date fecha;
}
