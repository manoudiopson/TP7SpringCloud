package diop.lucien.productservice.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    private final ProductRepository productRepository;

    public ProductConfig(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Bean
    CommandLineRunner init_product(){
        return args -> {
          productRepository.save(new Product("R001","IphoneX",10,15000));
          productRepository.save(new Product("R002","Samsung Galaxy S",15,11500));
          productRepository.save(new Product("R003","Sony Xperia",20,10000));
          productRepository.save(new Product("R004","Nokia",5,800));
          productRepository.save(new Product("R005","Techno pro",7,3000));

        };
    }
}
