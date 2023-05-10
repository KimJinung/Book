package kimjinung.theater.domain.discount.condition;

import kimjinung.theater.domain.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
