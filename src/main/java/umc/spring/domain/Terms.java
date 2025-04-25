package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.comoon.BaseEntity;
import umc.spring.domain.enums.TermsCode;

@Entity
@Table(name = "terms")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Terms extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TermsCode termsCode;
}