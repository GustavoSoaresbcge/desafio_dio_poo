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
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescription("Descrição Bootcamp Java Developer");
		bootcamp.getContents().add(curso1);
		bootcamp.getContents().add(curso2);
		bootcamp.getContents().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setName("Camila");
		devCamila.signUpBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de "+ devCamila.getName() + devCamila.getSubscriberContent());
		System.out.println("-");
		
		devCamila.makeProgress();
		
		System.out.println("Conteúdos Inscritos de "+ devCamila.getName() + devCamila.getSubscriberContent());
		System.out.println("Conteúdos Concluídos de " + devCamila.getName() + devCamila.getCompletedContent());
		System.out.println("-");
		System.out.println("XP: " + devCamila.calculateTotalXp());
		
		System.out.println("\n´´´´´´´´´´´´´´\n ");

		
		Dev devJoao = new Dev();
		devJoao.setName("Joao");
		devJoao.signUpBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de " + devJoao.getName() + devJoao.getSubscriberContent());
		System.out.println("-");
		
		devJoao.makeProgress();
		devJoao.makeProgress();
		devJoao.makeProgress();
		
		System.out.println("Conteúdos Inscritos de " + devJoao.getName() + devJoao.getSubscriberContent());
		System.out.println("Conteúdos Concluídos de " + devJoao.getName() + devJoao.getCompletedContent());
		System.out.println("-");
		System.out.println("XP: " + devJoao.calculateTotalXp());
	}

}
