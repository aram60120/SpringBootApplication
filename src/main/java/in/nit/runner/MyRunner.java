package in.nit.runner;

import org.springframework.boot.CommandLineRunner;

public class MyRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {

		System.out.println(" this is commandLineRunner");
	}

}
