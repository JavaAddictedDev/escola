package com.jaddicted.io.escola.entity.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

import com.jaddicted.io.escola.entity.domain.enums.StatusEstudantil;
import com.jaddicted.io.escola.entity.domain.values.Pessoa;
import com.jaddicted.io.escola.entity.system.Usuario;

public final class Estudante extends Usuario {
	private String id;
	private Pessoa dadosPessoais;
	private String matricula;
	private StatusEstudantil status;
	private LocalDate dataMatricula;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataAtualizacao;

	public Pessoa getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(Pessoa dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public StatusEstudantil getStatus() {
		return status;
	}

	public void setStatus(StatusEstudantil status) {
		this.status = status;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id, matricula);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		return Objects.equals(id, other.id) && Objects.equals(matricula, other.matricula);
	}

}
