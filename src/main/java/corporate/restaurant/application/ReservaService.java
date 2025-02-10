package corporate.restaurant.application;

import corporate.restaurant.domain.Reserva;
import corporate.restaurant.domain.Cliente;
import corporate.restaurant.domain.Mesa;
import corporate.restaurant.infraestructure.entity.ReservaEntity;
import corporate.restaurant.infraestructure.persistence.ReservaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservaService {
    private final ReservaRepository reservaRepository;

    public List<Reserva> listarReservas() {
        return reservaRepository.findAll().stream()
                .map(this::convertirAReserva)
                .collect(Collectors.toList());
    }

    public Reserva crearReserva(Reserva reserva) {
        ReservaEntity entidad = convertirAReservaEntity(reserva);
        ReservaEntity guardada = reservaRepository.save(entidad);
        return convertirAReserva(guardada);
    }

    public Optional<Reserva> obtenerReservaPorId(String id) {
        return reservaRepository.findById(id).map(this::convertirAReserva);
    }

    public void eliminarReserva(String id) {
        reservaRepository.deleteById(id);
    }

    // 🔄 Métodos para convertir entre Reserva y ReservaEntity
    private Reserva convertirAReserva(ReservaEntity entidad) {
        Cliente cliente = new Cliente();
        cliente.setId(entidad.getClienteId());

        Mesa mesa = new Mesa();
        mesa.setId(entidad.getMesaId());

        return new Reserva(
                cliente,
                mesa,
                entidad.getCantidadPersonas(),
                entidad.getFecha()
        );
    }

    private ReservaEntity convertirAReservaEntity(Reserva reserva) {
        ReservaEntity entidad = new ReservaEntity();
        entidad.setClienteId(reserva.getCliente().getId());
        entidad.setMesaId(reserva.getMesa().getId());
        entidad.setCantidadPersonas(reserva.getCantidadPersonas());
        entidad.setFecha(reserva.getFecha());
        
        return entidad;
    }

}
