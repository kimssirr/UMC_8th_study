package umc.spring.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShopCategory is a Querydsl query type for ShopCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShopCategory extends EntityPathBase<ShopCategory> {

    private static final long serialVersionUID = 706529760L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShopCategory shopCategory = new QShopCategory("shopCategory");

    public final umc.spring.domain.common.QBaseEntity _super = new umc.spring.domain.common.QBaseEntity(this);

    public final umc.spring.domain.QCategory category;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final umc.spring.domain.QShop shop;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QShopCategory(String variable) {
        this(ShopCategory.class, forVariable(variable), INITS);
    }

    public QShopCategory(Path<? extends ShopCategory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShopCategory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShopCategory(PathMetadata metadata, PathInits inits) {
        this(ShopCategory.class, metadata, inits);
    }

    public QShopCategory(Class<? extends ShopCategory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new umc.spring.domain.QCategory(forProperty("category")) : null;
        this.shop = inits.isInitialized("shop") ? new umc.spring.domain.QShop(forProperty("shop"), inits.get("shop")) : null;
    }

}

