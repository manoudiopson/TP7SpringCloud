package diop.lucien.billservice.feign;

import diop.lucien.billservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductRestService {
    @GetMapping("/products")
    PagedModel<Product> pageProducts(@RequestParam(value = "page") int page, @RequestParam(value = "size") int size);
    @GetMapping("/products/{ref}")
    Product getProductByRef(@PathVariable String ref);
}
