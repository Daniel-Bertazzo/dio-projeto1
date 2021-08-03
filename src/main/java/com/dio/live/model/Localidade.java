package com.dio.live.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {

    private long id;
    private String descricao;

    @ManyToOne
    private NivelAcesso nivelAcesso;

}
