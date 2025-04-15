package finance.control.system;

import finance.control.system.model.Company;
import finance.control.system.repository.CompanyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner demo(CompanyRepository repository) {
//		return (args) -> {
//			// Salva uma companhia
//			Company company = new Company();
//			company.setName("Bradesco");
//			company.setCnpj("00.000.000/0001-XX");
//			repository.save(company);
//
//			// Listar todos as empresas
//			repository.findAll().forEach(System.out::println);
//		};
//	}
}
