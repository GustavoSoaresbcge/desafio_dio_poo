package br.com.dio.desafio.dominio;

public class Curso {
	private String title;
	private String description;
	private int totalHours;
	
	public Curso() {
	}

	public String getTitle() {return title;}
	
	public void setTitle(String title) {this.title = title;}
	
	public String getDescription() {return description;}
	
	public void setDescription(String description) {this.description = description;}
	
	public int getTotalHours() {return totalHours;}
	
	public void setTotalHours(int totalHours) {this.totalHours = totalHours;}

	@Override
	public String toString() {
		return "Curso [title=" + title + ", description=" + description + ", totalHours=" + totalHours + "]";
	}
	
}
