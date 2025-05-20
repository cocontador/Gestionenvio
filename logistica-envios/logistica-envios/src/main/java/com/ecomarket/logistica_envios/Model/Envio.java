package com.ecomarket.logistica_envios.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoSeguimiento;
    private String direccionDestino;
    private String estado; // PREPARADO, ENVIADO, EN_CAMINO, ENTREGADO

    private LocalDate fechaEnvio;
    private LocalDate fechaEntregaEstimada;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private Proveedor proveedor;
}