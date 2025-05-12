package umc.spring.repository.ShopRespository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import umc.spring.domain.QShop;
import umc.spring.domain.Shop;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ShopRepositoryImpl implements ShopRepositoryCustom {

    private final JPAQueryFactory queryFactory;
    private final QShop shop = QShop.shop;

    @Override
    public List<Shop> dynamicQueryWithBooleanBuilder(String name, Float rating) {
        BooleanBuilder builder = new BooleanBuilder();

        if (name != null) {
            builder.and(shop.name.contains(name));
        }

        if (rating != null) {
            builder.and(shop.rating.goe(rating)); // 4.0 이상
//            builder.and(shop.rating.between(4.0f, 4.9f)); // 4.0 이상 5.0 미만
        }

        return queryFactory
                .selectFrom(shop)
                .where(builder)
                .fetch();
    }
}
