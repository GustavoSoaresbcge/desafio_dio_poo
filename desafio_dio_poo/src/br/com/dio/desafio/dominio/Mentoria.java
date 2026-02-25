package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
	private String title;
	private String description;
	private LocalDate data;
	
	public Mentoria() {
	}

	public String getTitle() {return title;}
	
	public void setTitle(String title) {this.title = title;}
	
	public String getDescription() {return description;}
	
	public void setDescription(String description) {this.description = description;}
	
	public LocalDate getData() {return data;}
	
	public void setData(LocalDate data) {this.data = data;}

	@Override
	public String toString() {
		return "Mentoria [title=" + title + ", description=" + description + ", data=" + data + "]";
	}
	
}
