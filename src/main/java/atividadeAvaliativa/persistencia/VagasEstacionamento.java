package atividadeAvaliativa.persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class VagasEstacionamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String quadra;
	private int numero;

	@OneToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Agenda> agendas = new ArrayList<>();

	public VagasEstacionamento() {
	}

	public VagasEstacionamento(Cliente cliente, String quadra, int numero) {
		this.cliente = cliente;
		this.quadra = quadra;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Agenda> getAgendas() {
		return agendas;
	}

	public void addAgendas(Agenda ag) {
		this.agendas.add(ag);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VagasEstacionamento other = (VagasEstacionamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
