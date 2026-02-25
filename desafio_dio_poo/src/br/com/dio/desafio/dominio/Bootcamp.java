package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String name;
	private String description;
	private final LocalDate inicialDate = LocalDate.now();
	private final LocalDate finalDate = inicialDate.plusDays(45);
	private Set<Dev> subscriberDev = new HashSet<>();
	private Set<Conteudo> contents = new LinkedHashSet<>();
	
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	public String getDescription() {return description;}
	
	public void setDescription(String description) {this.description = description;}
	
	public Set<Dev> getSubscriberDev() {return subscriberDev;}
	
	public void setSubscriberDev(Set<Dev> subscriberDev) {this.subscriberDev = subscriberDev;}
	
	public Set<Conteudo> getContents() {return contents;}
	
	public void setContents(Set<Conteudo> contents) {this.contents = contents;}
	
	public LocalDate getInicialDate() {return inicialDate;}
	
	public LocalDate getFinalDate() {return finalDate;}
	
	@Override
	public int hashCode() {
		return Objects.hash(contents, description, finalDate, inicialDate, name, subscriberDev);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(description, other.description)
				&& Objects.equals(finalDate, other.finalDate) && Objects.equals(inicialDate, other.inicialDate)
				&& Objects.equals(name, other.name) && Objects.equals(subscriberDev, other.subscriberDev);
	}

}
