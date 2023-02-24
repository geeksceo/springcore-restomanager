package com.skan.restomanager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.skan.restomanager.constants.Profile;
import com.skan.restomanager.constants.Unit;
import com.skan.restomanager.dao.IRoleDao;
import com.skan.restomanager.dao.IUserDao;
import com.skan.restomanager.domain.Recette;
import com.skan.restomanager.domain.Role;
import com.skan.restomanager.domain.User;
import com.skan.restomanager.service.IUserService;
import com.skan.restomanager.service.RecetteService;
import com.skan.restomanager.service.RoleService;
import com.skan.restomanager.service.UserService;


@SpringBootApplication
public class SpringcoreRestomanagerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringcoreRestomanagerApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner test(
			UserService userService, 
			RoleService roleService,
			RecetteService recetteService) {
		return (args) -> {
			

			System.out.println("----------------------------------");
			System.out.println("----------Create few users--------");
			System.out.println("----------------------------------");
			// save few users
			userService.save(new User("geeksceo", "oowashina@gmail.com"));
			userService.save(new User("tanfolo", "joel.tanfolo@skanci.com", "12345678"));
			
			System.out.println("----------------------------------");
			System.out.println("----------Create few roles--------");
			System.out.println("----------------------------------");
			// save few roles
			// Good value from enumerate
			roleService.save(new Role(Profile.ADMIN));
			roleService.save(new Role(Profile.USER));
			// Try to add Role from profile string value given by user 
			// Value whose doesn't exists
			// roleService.save( new Role(Profile.convertFromString("CUISINIER")) );
			// Good value from enumerate but given as string
			
			System.out.println("----------------------------------");
			System.out.println("----------Create few recettes--------");
			System.out.println("----------------------------------");
			// with `name` only
			recetteService.save(new Recette("Tarte à la fraise"));
			// with name and duration
			recetteService.save(new Recette("Foutou banane sauce arachide", 40));
			// full
			recetteService.save(new Recette("Riz a la vapeur", 25, Unit.MIN));
			
			
		};
	}

	
}
