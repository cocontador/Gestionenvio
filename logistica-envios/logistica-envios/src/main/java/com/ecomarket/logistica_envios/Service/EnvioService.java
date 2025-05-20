package com.ecomarket.logistica_envios.Service;

import com.ecomarket.logisticaenvios.model.Envio;

import java.util.List;

public interface EnvioService {
    Envio crearEnvio(Envio envio);
    Envio actualizarEstado(String codigo, String estado);
    Envio obtenerPorCodigo(String codigo);
    List<Envio> listarEnvios();
}