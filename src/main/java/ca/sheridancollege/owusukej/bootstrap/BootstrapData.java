package ca.sheridancollege.owusukej.bootstrap;

	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;

	import ca.sheridancollege.owusukej.beans.*;
import ca.sheridancollege.owusukej.repositoris.StudentRepository;
import lombok.AllArgsConstructor;

	@Component
	@AllArgsConstructor
	
	public class BootstrapData implements CommandLineRunner {
		private StudentRepository studentRepo;
		
		@Override
		public void run(String...args) throws Exception{
						
			
			Student p2 = new Student(9,"poooo");
			studentRepo.save(p2);
		

	}


}
