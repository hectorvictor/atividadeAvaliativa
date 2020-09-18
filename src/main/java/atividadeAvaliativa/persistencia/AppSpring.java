package atividadeAvaliativa.persistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSpring implements CommandLineRunner {
	@Autowired
	private SpringService serviço;

	public static void main(String[] args) {
		SpringApplication.run(AppSpring.class, args).close();

	}

	@Override
	public void run(String... args) throws Exception {
		serviço.testarPersistencia();

	}
}
