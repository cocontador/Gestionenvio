package com.ecomarket.logistica_envios.Controller;

import com.ecomarket.logisticaenvios.model.Envio;
import com.ecomarket.logisticaenvios.service.EnvioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/envios")
public class EnvioController {

    private final EnvioService envioService;

    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;
    }

    @PostMapping
    public ResponseEntity<Envio> crear(@RequestBody Envio envio) {
        return ResponseEntity.ok(envioService.crearEnvio(envio));
    }

    @PutMapping("/{codigo}/estado")
    public ResponseEntity<Envio> actualizarEstado(@PathVariable String codigo, @RequestParam String estado) {
        return ResponseEntity.ok(envioService.actualizarEstado(codigo, estado));
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Envio> obtener(@PathVariable String codigo) {
        return ResponseEntity.ok(envioService.obtenerPorCodigo(codigo));
    }

    @GetMapping
    public ResponseEntity<List<Envio>> listar() {
        return ResponseEntity.ok(envioService.listarEnvios());
    }
}