package diop.lucien.billservice.billing;

import diop.lucien.billservice.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Bill {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;
    private LocalDate billingDate;
    private Long customerID;
    @Transient
    private Customer customer;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;
}
