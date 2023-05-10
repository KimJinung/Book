package kimjinung.theater.domain.discount.policy;

import kimjinung.theater.domain.common.Money;
import kimjinung.theater.domain.discount.condition.DiscountCondition;
import kimjinung.theater.domain.movie.Screening;

import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{
    private final List<DiscountCondition> conditions;

    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
