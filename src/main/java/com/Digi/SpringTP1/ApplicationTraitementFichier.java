package com.Digi.SpringTP1;

import com.Digi.SpringTP1.data.Ville;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@SpringBootApplication
public class ApplicationTraitementFichier implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ApplicationTraitementFichier.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}
	@Override
	public void run(String... args) throws Exception {
		Path path = Paths.get("/Users/gueye/Documents/DATA ENGINEER/14. Spring Framework/TP/recensement.csv");
		List<String> lignes = Files.readAllLines(path);
		lignes.remove(0);
		for(String ligne : lignes){
			System.out.println(ligne);
			String[] elements = ligne.split(";");
			Ville nvVille = new Ville();

		}
		boolean exists = Files.exists(path);
	}
}

