package com.example.cursos_online;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cursos_online.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
	
	@Test
	 public void verificaDireitoConcedidoDeMaisCursos(){
	  var usuario = new Usuario("João", new Ra("230890"), new Email("jm2matheus@gmail.com"));
	  usuario.setCurso(new Curso("Inglês" , 8, new FinalizouCurso(true), new Professor("Fábio"), new Materia("Linguagens")));
	  var cursosDisponiveis = usuario.getNumeroCursosDisponiveis();
	  usuario.disponibilizaCursoPorMedia();
	  assertEquals(cursosDisponiveis+3, usuario.getNumeroCursosDisponiveis(), "O usuario deve ter direito a mais 3 cursos");
	}
	
	@Test
	 public void verificaDireitoNegadoDeMaisCursos(){
	  var usuario = new Usuario("João", new Ra("230890"), new Email("jm2matheus@gmail.com"));
	  usuario.setCurso(new Curso("Português" , 5, new FinalizouCurso(true), new Professor("Fábio"), new Materia("Linguagens"))); 
	  var cursosDisponiveis = usuario.getNumeroCursosDisponiveis();
	  usuario.disponibilizaCursoPorMedia();
	  assertEquals(cursosDisponiveis, usuario.getNumeroCursosDisponiveis(), "O usuario deve ter o mesmo número de cursos antes do método");
	}

}
