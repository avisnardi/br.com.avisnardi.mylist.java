package br.com.wsn.mylist.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.wsn.mylist.api.data.model.Catalog;
import br.com.wsn.mylist.api.data.repository.CatalogRepository;
import br.com.wsn.mylist.api.service.CatalogService;
import br.com.wsn.mylist.api.service.UserService;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	private final CatalogService catalogService;
	private final UserService userService;
		
	public ApiApplication(CatalogService catalogService, 
			UserService userService) {
		this.catalogService = catalogService;
		this.userService = userService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	catalogService.insert();
		//	userService.insert();
	}

}
