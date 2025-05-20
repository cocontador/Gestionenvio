package com.ecomarket.logistica_envios.Service;

import com.ecomarket.logisticaenvios.model.Envio;
import com.ecomarket.logisticaenvios.repository.EnvioRepository;
import com.ecomarket.logisticaenvios.service.EnvioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvioServiceImpl implements EnvioService {

    private final EnvioRepository envioRepository;

    public EnvioServiceImpl(EnvioRepository envioRepository) {
        this.envioRepository = envioRepository;
    }

    @Override
    public Envio crearEnvio(Envio envio) {
        return envioRepository.save(envio);
    }

    @Override
    public Envio actualizarEstado(String codigo, String estado) {
        Envio envio = envioRepository.findByCodigoSeguimiento(codigo)
                .orElseThrow(() -> new RuntimeException("Envío no encontrado"));
        envio.setEstado(estado);
        return envioRepository.save(envio);
    }

    @Override
    public Envio obtenerPorCodigo(String codigo) {
        return envioRepository.findByCodigoSeguimiento(codigo)
                .orElseThrow(() -> new RuntimeException("Envío no encontrado"));
    }

    @Override
    public List<Envio> listarEnvios() {
        return envioRepository.findAll();
    }
}