package customer.service;

import customer.service.Repositories.CustomerRepository;
import customer.service.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner CommandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder()
					.name("John")
					.email("jhon@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Smith")
					.email("smith@gmail.com")
					.build());
			customerRepository.findAll().forEach(c -> {
				System.out.println(c.getId());
				System.out.println(c.getName());
				System.out.println(c.getEmail());
			});
		};
	}
}
