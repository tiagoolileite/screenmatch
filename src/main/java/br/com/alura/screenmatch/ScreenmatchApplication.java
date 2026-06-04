package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScreenmatchApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ScreenmatchApplication.class, args);
		Principal principal = ctx.getBean(Principal.class);
		principal.exibeMenu();
	}
}
