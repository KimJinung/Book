package kimjinung.theater.domain.discount.policy;

import kimjinung.theater.domain.common.Money;
import kimjinung.theater.domain.discount.condition.DiscountCondition;
import kimjinung.theater.domain.movie.Screening;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDefaultDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
