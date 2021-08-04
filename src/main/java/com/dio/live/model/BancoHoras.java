package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimento;
        private long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;

    // CategoriaUsuario nao precisa ter -> redundancia de dados
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHorasTrabalhadas;
    private BigDecimal saldoHorasTrabalhadas;

}
