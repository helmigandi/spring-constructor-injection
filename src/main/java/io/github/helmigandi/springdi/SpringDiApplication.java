package io.github.helmigandi.springdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		// Manual without Spring Bean
//		VideoRepository repository = new VideoRepository();
//		VideoController controller = new VideoController(repository);
//		String response = controller.next();
//		System.out.println(response);

		/**
		 * Print all Bean name which are manages by spring including
		 * videoRepository, videoController and commandLineRunner
		 */
		ConfigurableApplicationContext app =
				SpringApplication.run(SpringDiApplication.class, args);
		Arrays.stream(app.getBeanDefinitionNames())
				.forEach(System.out::println);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Hello from CommandLineRunner");
		};
	}

}
