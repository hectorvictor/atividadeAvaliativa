package atividadeAvaliativa.persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Atendente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@OneToMany(cascade = CascadeType.ALL)
	private List<VagasEstacionamento> estacionamentos = new ArrayList<>();

	public Atendente() {
	}

	public Atendente(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<VagasEstacionamento> getEstacionamentos() {
		return estacionamentos;
	}

	public void addEstacionamentos(VagasEstacionamento est) {
		this.estacionamentos.add(est);
	}

}
