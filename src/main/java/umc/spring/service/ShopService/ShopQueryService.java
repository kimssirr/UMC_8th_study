package umc.spring.service.ShopService;

import umc.spring.domain.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopQueryService {

    Optional<Shop> findShop(Long id);

    List<Shop> findShopsByNameAndRating(String name, Float rating);
}
