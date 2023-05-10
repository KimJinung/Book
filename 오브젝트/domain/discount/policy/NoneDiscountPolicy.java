package kimjinung.theater.domain.discount.policy;

import kimjinung.theater.domain.common.Money;
import kimjinung.theater.domain.movie.Screening;

public class NoneDiscountPolicy implements DiscountPolicy{
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
