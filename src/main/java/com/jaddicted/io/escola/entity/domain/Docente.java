package com.jaddicted.io.escola.entity.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.jaddicted.io.escola.entity.domain.values.Pessoa;

public class Docente {
	private Pessoa dadosPessoais;
	private Profissional dadosProProfissionais;
	private LocalDate dataMatricula;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataAtualizacao;
}
