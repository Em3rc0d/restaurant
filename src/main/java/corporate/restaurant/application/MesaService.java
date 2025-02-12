package corporate.restaurant.application;

import corporate.restaurant.infraestructure.entity.MesaEntity;
import corporate.restaurant.infraestructure.persistence.MesaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MesaService {

    private final MesaRepository mesaRepository;

    public List<MesaEntity> findAll() {
        return mesaRepository.findAll();
    }

    public Optional<MesaEntity> findById(String id) {
        return mesaRepository.findById(id);
    }

    public MesaEntity save(MesaEntity mesa) {
        return mesaRepository.save(mesa);
    }

    public void deleteById(String id) {
        mesaRepository.deleteById(id);
    }
}
