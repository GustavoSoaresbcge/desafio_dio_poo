package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private LocalDate data;
	
	public Mentoria() {
	}
	
	public LocalDate getData() {return data;}
	
	public void setData(LocalDate data) {this.data = data;}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", titulo=" + getTitle() + ", descricao=" + getDescription() + "]";
	}

	@Override
	public double calculateXp() {
		return DEFAULT_XP + 20d;
	}
	
}
