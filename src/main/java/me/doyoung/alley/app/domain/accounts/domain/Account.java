package me.doyoung.alley.app.domain.accounts.domain;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 이메일
    @Column(unique = true)
    private String email;

    // 비밀번호
    @Column(nullable = false, length = 100)
    private String password;

    // 생년월일
    @Column(nullable = false, length = 30)
    private String dayOfBirth;

    // 휴대폰 번호
    @Column(nullable = false, length = 20)
    private String phoneNumber; // "010-5627-5281"

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<AccountRole> roles;

//    빵긋 이용약관,
//    전자금융거래 이용약관 동의,
//    개인정보 수집 및 이용 동의,
//    개인정보 제3자 제공 동의 (선택)
//    마케팅 정보 메일,  SMS 수신 동의 (선택)

    // 회원 타입

}
