package kimjinung.theater.domain.discount.policy;

import kimjinung.theater.domain.common.Money;
import kimjinung.theater.domain.discount.condition.DiscountCondition;
import kimjinung.theater.domain.movie.Screening;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDefaultDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
