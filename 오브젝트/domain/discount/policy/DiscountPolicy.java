package kimjinung.theater.domain.discount.policy;

import kimjinung.theater.domain.common.Money;
import kimjinung.theater.domain.movie.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
