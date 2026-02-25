package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitle("Curso Java");
		curso1.setDescription("Descrição do curso Java");
		curso1.setTotalHours(8);
		
		Curso curso2 = new Curso();
		curso2.setTitle("Curso Js");
		curso2.setDescription("Descrição do curso Js");
		curso2.setTotalHours(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitle("Mentoria de Java");
		mentoria.setDescription("Descrição da mentoria Java");
		mentoria.setData(LocalDate.now());
	}

}
