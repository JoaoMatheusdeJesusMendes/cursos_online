package com.cursos_online.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class Curso {
	private String nomeCurso;
	private float media;
	private boolean finalizouCurso;
	
	 public Curso(String nomeCurso, float media, boolean finalizouCurso) {
	     this.nomeCurso = nomeCurso;
	     this.media = media;
	     this.finalizouCurso = finalizouCurso;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public boolean getFinalizouCurso() {
		return finalizouCurso;
	}
	
	public void setFinalizouCurso(boolean finalizouCurso) {
		this.finalizouCurso = finalizouCurso;
	}
	
	public float getMedia() {
		return media;
	}
	
	public void setMedia(float media) {
		this.media = media;
	}
	
	

}
