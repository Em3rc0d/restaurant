package corporate.restaurant.application;

import corporate.restaurant.infraestructure.entity.ClienteEntity;
import corporate.restaurant.infraestructure.persistence.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public List<ClienteEntity> findAll(){
        return clienteRepository.findAll();
    }

    public ClienteEntity save(ClienteEntity cliente){
        return clienteRepository.save(cliente);
    }

    public void deleteById(String id){
        clienteRepository.deleteById(id);
    }

    public Optional<ClienteEntity> findById(String id){
        return clienteRepository.findById(id);
    }

    public ClienteEntity editClientById(String id, ClienteEntity cliente) {
        return clienteRepository.findById(id).map(existingCliente -> {
            existingCliente.setNombre(cliente.getNombre());
            existingCliente.setCorreo(cliente.getCorreo());
            // Agrega más atributos si es necesario
            return clienteRepository.save(existingCliente);
        }).orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + id));
    }


}
