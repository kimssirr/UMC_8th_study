package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;
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
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    private Float rating;

    @OneToMany(mappedBy = "shop")
    private List<Mission> missionList = new ArrayList<>();

    @OneToMany(mappedBy = "shop")
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "shop")
    private List<ShopCategory> shopCategoryList = new ArrayList<>();

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region=" + region +
                ", missionList=" + missionList +
                ", reviewList=" + reviewList +
                ", shopCategoryList=" + shopCategoryList +
                '}';
    }
}