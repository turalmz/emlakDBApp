package com.emlak;

import com.emlak.entity.Objekt;
import com.emlak.service.inter.ObjectServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmlakDbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmlakDbAppApplication.class, args);
	}

	@Autowired
	private ObjectServiceInter userService;


	@Bean
	public CommandLineRunner run() {
		CommandLineRunner clr = new CommandLineRunner(){

			@Override
			public void run(String... args) throws Exception {

                            userService.getAll();
				for(int i=0;i<10;i++){
					
					Objekt u = userService.getById(i);
					System.out.println(u);
//					if(u!=null){
//                                            
//						u.setAbout("Pala");
//						userService.addObjekt(u);
//					}
//					User u1 = new User(1,)
				}

				//userService.getById(1);//
			}
		};

		return clr;
	}
}
