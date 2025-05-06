package umc.spring.repository.ShopRespository;

import umc.spring.domain.Shop;

import java.util.List;

public interface ShopRepositoryCustom {
    List<Shop> dynamicQueryWithBooleanBuilder(String name, Float rating);
}
