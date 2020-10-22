package homes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import homes.beans.Address;
import homes.beans.Home;
import homes.controller.BeanConfiguration;
import homes.repository.HomeRepository;

@SpringBootApplication
public class HomesForSaleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HomesForSaleApplication.class, args);
	}

	@Autowired
	HomeRepository repo;

	@Override
	public void run(String... args) throws Exception {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);


		Home h1 = new Home(289000, 4, true, "detached double");
		Address a1 = new Address("906 Forest Avenue", "Des Moines", "IA", 50311);
		h1.setAddress(a1);
		repo.save(h1);
		
		Home h2 = new Home(225000, 3, false, "single tuck-under");
		Address a2 = new Address("321 Polk Boulevard", "Des Moines", "IA", 50312);
		h2.setAddress(a2);
		repo.save(h2);

		List<Home> allMyContacts = repo.findAll();
		for (Home home : allMyContacts) {
			System.out.println(home.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
