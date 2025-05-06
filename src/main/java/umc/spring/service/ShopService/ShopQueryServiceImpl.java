package umc.spring.service.ShopService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.domain.Shop;
import umc.spring.repository.ShopRespository.ShopRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ShopQueryServiceImpl implements ShopQueryService {

    private final ShopRepository shopRepository;

    @Override
    public Optional<Shop> findShop(Long id) {
        return shopRepository.findById(id);
    }

    @Override
    public List<Shop> findShopsByNameAndRating(String name, Float rating) {
        List<Shop> filteredShops = shopRepository.dynamicQueryWithBooleanBuilder(name, rating);

        filteredShops.forEach(shop -> System.out.println("Shop: " + shop));

        return filteredShops;
    }
}