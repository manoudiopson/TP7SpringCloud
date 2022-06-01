package diop.lucien.billservice.feign;

import diop.lucien.billservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestService {
    @GetMapping("/customers/{id}")
    Customer getCustomerByID(@PathVariable(name = "id") Long id);
}
