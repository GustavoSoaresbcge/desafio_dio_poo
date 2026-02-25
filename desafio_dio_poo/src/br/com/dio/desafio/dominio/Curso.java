package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	private int totalHours;
	
	public Curso() {
	}
	
	public int getTotalHours() {return totalHours;}
	
	public void setTotalHours(int totalHours) {this.totalHours = totalHours;}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitle() + ", descricao=" + getDescription() + ", cargaHoraria=" + totalHours + "]";
	}

	@Override
	public double calculateXp() {
		return DEFAULT_XP + 20d;
	}
	
}
