package corporate.restaurant.application;

import corporate.restaurant.infraestructure.entity.TrabajadorEntity;
import corporate.restaurant.infraestructure.persistence.TrabajadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TrabajadorService {

    private final TrabajadorRepository trabajadorRepository;

    public List<TrabajadorEntity> findAll(){
        return trabajadorRepository.findAll();
    }

    public Optional<TrabajadorEntity> findById(String id){
        return trabajadorRepository.findById(id);
    }

    public TrabajadorEntity save(TrabajadorEntity trabajador){
        return trabajadorRepository.save(trabajador);
    }

    public void deleteById(String id){
        trabajadorRepository.deleteById(id);
    }

    public TrabajadorEntity editTrabajadorById(String id, TrabajadorEntity trabajador) {
        return trabajadorRepository.findById(id).map(existingTrabajador -> {
            existingTrabajador.setPuesto(trabajador.getPuesto());
            existingTrabajador.setSalario(trabajador.getSalario());
            existingTrabajador.setHorasTrabajadas(trabajador.getHorasTrabajadas());
            return trabajadorRepository.save(existingTrabajador);
        }).orElseThrow(() -> new RuntimeException("Trabajador no encontrado con ID: " + id)); // Lanzar la excepción personalizada
    }

}
