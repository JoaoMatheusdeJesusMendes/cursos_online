package com.cursos_online.model;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	private Long
	private String nome;
	@Embedded
	private Ra ra;
	@Embedded
	private Email email;
	private int numeroCursosDisponiveis;
	private Curso curso;
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroCursosDisponiveis() {
		return numeroCursosDisponiveis;
	}
	
	public void setNumeroCursosDisponiveis(int numeroCursosDisponiveis) {
		this.numeroCursosDisponiveis = numeroCursosDisponiveis;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public Ra getRa() {
		return ra;
	}

	public void setRa(Ra ra) {
		this.ra = ra;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}	
	
	public void disponibilizaCursoPorMedia() {
		if(this.curso.getMedia() >= 7 && this.curso.getFinalizouCurso() == true) {
			this.numeroCursosDisponiveis += 3;
		}
	}


}
