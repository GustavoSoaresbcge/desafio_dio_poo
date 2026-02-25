package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Conteudo> subscriberContent = new LinkedHashSet<>();
	private Set<Conteudo> completedContent = new LinkedHashSet<>();
	
	public void signUpBootcamp(Bootcamp bootcamp) {
		this.subscriberContent.addAll(bootcamp.getContents());
		bootcamp.getSubscriberDev().add(this);
	}
	
	public void makeProgress() {
		Optional<Conteudo> conteudo = this.subscriberContent.stream().findFirst();
		if(conteudo.isPresent()) {
			this.completedContent.add(conteudo.get());
			this.subscriberContent.remove(conteudo.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	public double calculateTotalXp() {
		return this.completedContent.stream().mapToDouble(conteudo -> conteudo.calculateXp()).sum();
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public Set<Conteudo> getSubscriberContent() {return subscriberContent;}

	public void setSubscriberContent(Set<Conteudo> subscriberContent) {this.subscriberContent = subscriberContent;}

	public Set<Conteudo> getCompletedContent() {return completedContent;}

	public void setCompletedContent(Set<Conteudo> completedContent) {this.completedContent = completedContent;}

	@Override
	public int hashCode() {
		return Objects.hash(completedContent, name, subscriberContent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(completedContent, other.completedContent) && Objects.equals(name, other.name)
				&& Objects.equals(subscriberContent, other.subscriberContent);
	}
	
}
