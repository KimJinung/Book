package kimjinung.theater.domain.movie;

import kimjinung.theater.domain.common.Money;
import kimjinung.theater.domain.discount.policy.DefaultDiscountPolicy;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DefaultDiscountPolicy defaultDiscountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DefaultDiscountPolicy defaultDiscountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.defaultDiscountPolicy = defaultDiscountPolicy;
    }

    public Money getFee() {
        return this.fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(defaultDiscountPolicy.calculateDiscountAmount(screening));
    }
}
