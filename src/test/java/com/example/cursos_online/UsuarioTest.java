package com.example.cursos_online;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cursos_online.model.*;

public class UsuarioTest {
	
	@Test
	 public void verificaDireitoConcedidoDeMaisCursos(){
	  var usuario = new Usuario("João");
	  usuario.setCurso(new Curso("Inglês" , 8, true));
	  var cursosDisponiveis = usuario.getNumeroCursosDisponiveis();
	  usuario.disponibilizaCursoPorMedia();
	  assertEquals(cursosDisponiveis+3, usuario.getNumeroCursosDisponiveis(), "O usuario deve ter direito a mais 3 cursos");
	}
	
	@Test
	 public void verificaDireitoNegadoDeMaisCursos(){
	  var usuario = new Usuario("João");
	  usuario.setCurso(new Curso("Português" , 5, true)); 
	  var cursosDisponiveis = usuario.getNumeroCursosDisponiveis();
	  usuario.disponibilizaCursoPorMedia();
	  assertEquals(cursosDisponiveis, usuario.getNumeroCursosDisponiveis(), "O usuario deve ter o mesmo número de cursos antes do método");
	}

}
