package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.comoon.BaseEntity;
import umc.spring.domain.mapping.ShopCategory;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shop")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Shop extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String shopName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToMany(mappedBy = "shop")
    private List<Mission> missionList = new ArrayList<>();

    @OneToMany(mappedBy = "shop")
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "shop")
    private List<ShopCategory> shopCategoryList = new ArrayList<>();
}