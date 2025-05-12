package umc.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import umc.spring.service.ShopService.ShopQueryService;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public CommandLineRunner run(ApplicationContext context) {
		return args -> {
			ShopQueryService shopService = context.getBean(ShopQueryService.class);

			// 파라미터 값 설정
			String name = "요아정";
			Float rating = 4.0f;

			// 쿼리 메서드 호출 및 파라미터 출력
			System.out.println("Executing findShopsByNameAndRating with parameters:");
			System.out.println("Name: " + name);
			System.out.println("Rating: " + rating);

			shopService.findShopsByNameAndRating(name, rating)
					.forEach(System.out::println);
		};
	}


}