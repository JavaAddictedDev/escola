package com.jaddicted.io.escola.entity.domain.values;

import java.time.LocalDate;

import com.jaddicted.io.escola.entity.domain.enums.Genero;
import com.jaddicted.io.escola.entity.domain.enums.OrientacaoSexual;

public final class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate nascimento;
	private Genero sexo;
	private OrientacaoSexual orientacaoSexual;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public Genero getSexo() {
		return sexo;
	}
	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}
	public OrientacaoSexual getOrientacaoSexual() {
		return orientacaoSexual;
	}
	public void setOrientacaoSexual(OrientacaoSexual orientacaoSexual) {
		this.orientacaoSexual = orientacaoSexual;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
