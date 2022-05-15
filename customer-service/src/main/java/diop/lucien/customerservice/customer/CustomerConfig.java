package diop.lucien.customerservice.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    private final CustomerRepository customerRepository;

    public CustomerConfig(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Bean
    CommandLineRunner init_customer(){
        return args -> {
            if (customerRepository.count() == 0) {
                customerRepository.save(new Customer(null, "Lucien", "lucien@gmail.com"));
                customerRepository.save(new Customer(null, "Emile", "emile@gmail.com"));
                customerRepository.save(new Customer(null, "Val", "val@gmail.com"));
                customerRepository.save(new Customer(null, "Felix", "felix@gmail.com"));
            }
        };
    }
}
