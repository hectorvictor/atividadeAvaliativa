package atividadeAvaliativa.persistencia;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SpringService {
	@Autowired
	private EntityManager em;

	public void testarPersistencia() {
		Atendente atendente = new Atendente("hector");
		Veiculo ford = new Veiculo("Ford", "Escort", 1994);
		Cliente hedqueili = new Cliente("Hedqueili", "99912-3456", "09955588844", ford);
		VagasEstacionamento vg = new VagasEstacionamento(hedqueili, "Q74", 5);
		Agenda ag = new Agenda("17/09/2020");
		Agenda ag1 = new Agenda("19/09/2020");
		atendente.addEstacionamentos(vg);
		vg.addAgendas(ag);
		vg.addAgendas(ag1);
		em.persist(atendente);

	}

}
