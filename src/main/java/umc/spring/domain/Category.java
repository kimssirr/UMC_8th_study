package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.comoon.BaseEntity;
import umc.spring.domain.enums.FoodCategory;

@Entity
@Table(name = "category")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Category extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FoodCategory foodCategory;
}