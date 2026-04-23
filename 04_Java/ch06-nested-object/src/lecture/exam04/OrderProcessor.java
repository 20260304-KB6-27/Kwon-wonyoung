package lecture.exam04;

// 시나리오. 주문처리기(외부클래스)와 할인정책(내부인터페이스)

public class OrderProcessor {

    public interface DiscountPolicy {
        // 기존 금액 전달 받아서 할인 적용 후 할인 금액 반환
        int applyDiscount(int price);
    }

    // 할인정책 구현 객체를 기록할 필드
    private DiscountPolicy policy;

    // 할인정책 설정 메소드
    public void setDiscountPolicy(DiscountPolicy policy){
        this.policy = policy;
    }

    // 주문처리 메소드
    public void orderProcess(int price){ // 기존 금액
        // 최종 주문 금액 (할인 여부에 따른)
        int finalPrice = price;

        if(policy != null) { // 할인할 경우
            finalPrice = policy.applyDiscount(price);
        }
        System.out.println("최종 주문 금액: " + finalPrice);

    }

}
