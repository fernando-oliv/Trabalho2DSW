package br.ufscar.dc.dsw;


import java.util.HashSet;
import java.util.List;
import br.ufscar.dc.dsw.domain.*;
import br.ufscar.dc.dsw.dao.IUsuarioDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

    @Bean
	public CommandLineRunner demo(IUsuarioDAO usuarioDAO) {
		return (args) -> {
			
			Usuario u1 = new Usuario("admin", "admin@admin.com", "admin", "Admin");
			usuarioDAO.save(u1);
			
		};
	}

}
