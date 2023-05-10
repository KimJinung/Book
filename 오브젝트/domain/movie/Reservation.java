package kimjinung.theater.domain.movie;

import kimjinung.theater.domain.common.Customer;
import kimjinung.theater.domain.common.Money;
import kimjinung.theater.domain.movie.Screening;

public class Reservation {
    private final Customer customer;
    private final Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
