package corporate.restaurant.presentation;

import corporate.restaurant.application.MesaService;
import corporate.restaurant.infraestructure.entity.MesaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mesas")
@RequiredArgsConstructor
public class MesaController {

    private final MesaService mesaService;

    @GetMapping
    public ResponseEntity<List<MesaEntity>> listarMesas() {
        List<MesaEntity> mesas = mesaService.findAll();
        return ResponseEntity.ok(mesas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MesaEntity> obtenerMesaPorId(@PathVariable String id) {
        return mesaService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<MesaEntity> crearMesa(@RequestBody MesaEntity mesa) {
        MesaEntity nuevaMesa = mesaService.save(mesa);
        URI location = URI.create("/api/mesas/" + nuevaMesa.getId());
        return ResponseEntity.created(location).body(nuevaMesa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMesa(@PathVariable String id) {
        Optional<MesaEntity> mesa = mesaService.findById(id);
        if (mesa.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        mesaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
