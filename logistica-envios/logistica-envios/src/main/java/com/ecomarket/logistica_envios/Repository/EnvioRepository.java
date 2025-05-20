package com.ecomarket.logistica_envios.Repository;

import com.ecomarket.cl.logisticaenvios.model.Envio; 
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnvioRepository extends JpaRepository<Envio, Long> {
    
}
