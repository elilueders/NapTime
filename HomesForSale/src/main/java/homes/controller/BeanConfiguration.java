package homes.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import homes.beans.Address;
import homes.beans.Home;

@Configuration
public class BeanConfiguration {

	@Bean
	public Home home() {
		Home bean = new Home();
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address();
		return bean;
	}
}
