# Alley project

## 프로젝트 주제

동네 빵집을 편리하게 이용하는 서비스 

## 프로젝트 목표

고객은 갓 구운빵을 픽업 하거나 원하는 빵을 픽업할 수 있고,
마감 시간에 빵은 저렴하게 픽업 할 수 있다.

그럼으로써 다양한 동네 빵집에 개성있는 빵을 경험 할 수있다.

반면 파트너는 갓 구운 빵을 제공하고 당일 버려지는 빵들을 최소한으로 줄일 수 있다.

## 요구사항
에그리거트: 파트너, 고객, 주문, 결제

* 파트너

 -[ ] 아이디, 비밀번호, 핸드폰번호, 가게 소개와 영업정보(운영시간, 주소, 휴무일, 편의시설, 전화번호, 사업자 번호),
  대표사진들, 빵집이름 을 통해 파트너가 될 수있다.
 -[ ] 처음 영업상태는 일시 정지이고 사용자에게는 준비중으로 보인다.
 -[ ] 포스기로 처음 로그인을 하고 가이드를 진행한 다음 영업 중으로 변경 될 수 있다.
 -[ ] 메뉴 이름, 사진, 가격, 
 빵이 나오는 시간, 갓구운 빵 예약 정원, 갓구운 빵 예약 마감 기간
 예약가능 여부, 가능하다면 예약 마감 시간 등을 이용해 빵집의 메뉴 구성을 할 수 있다.
 -[ ] 마감 시간에 기존에 메뉴를 가져와 가격을 재설정 하여 마감 메뉴 구성 할 수 있다.
 -[ ] 주문 종류 별 매장 상태를 변경 할 수 있다.
    - 상태는 다음과 같다.
    - 영업중, 영업 일시 중지(30, 60, 90)
    - 중지한다면 중지사유를 선택 할 수있다.
        - 배달원 부족, 영업 중지, 기타, 주문 처리 불가, 메뉴 품절, 기술적 문제 발생
- [ ] 빵집의 주문을 조회 할 수 있다.
- [ ] 해당 주문을 수락 또는 거절 할 수 있다.
    - 수락 할 경우, 소요시간을 과 함께 기입 해야 한다.
    - 거절 할 경우 다음과 같다.
        - 주 사유: 영업 시간 종료, 주문량 폭주, 해당 메뉴 품절
        - 기타 사유: 메뉴 또는 계정의 문제, 요청사항 적용 불가, 중복 주문, 장난 주문, 기상 악화
    - 만약, 주 사유 일 경우에 주 사유에 맞게 시스템 적용을 할 수 있다.
- [ ] 주문을 조회 할 수 있다.

* 고객

- [ ] 아이디, 비밀번호, 핸드폰번호 를 통해 고객이 될 수 있다.
- [ ] 빵집을 조회 할 수 있다.
- [ ] 빵집의 메뉴를 조회 할 수 있다.
- [ ] 빵집의 메뉴를 장바구니에 담을 수 있다.
- [ ] 장바구니에 있는 빵들을 구매 할 수 있다.
- [ ] 구매한 빵의 상태를 확인 할 수 있다.
- [ ] 파트너가 거절하기 전까지 주문을 취소할 수 있다.


### 용어사전
| 한글                        | 영문              | 설명                 |  
| ---------- | :--------- | :---------- |  
| 파트너 | Partners | 빵집을 관리하는 사람 |  


### **모델링**