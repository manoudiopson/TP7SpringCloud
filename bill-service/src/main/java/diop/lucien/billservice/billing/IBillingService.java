package diop.lucien.billservice.billing;

public interface IBillingService {
    Bill getBillDetails(long id) throws Exception;
}
