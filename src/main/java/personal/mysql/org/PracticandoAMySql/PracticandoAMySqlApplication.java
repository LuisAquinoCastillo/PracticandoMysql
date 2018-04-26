package personal.mysql.org.PracticandoAMySql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "personal.mysql.org.PracticandoAMySql.repositorio")
@SpringBootApplication
public class PracticandoAMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticandoAMySqlApplication.class, args);
	}
}
