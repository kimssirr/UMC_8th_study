package umc.spring.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserNotification is a Querydsl query type for UserNotification
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserNotification extends EntityPathBase<UserNotification> {

    private static final long serialVersionUID = -1928540638L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserNotification userNotification = new QUserNotification("userNotification");

    public final umc.spring.domain.common.QBaseEntity _super = new umc.spring.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final umc.spring.domain.QNotification notification;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final umc.spring.domain.QUser user;

    public QUserNotification(String variable) {
        this(UserNotification.class, forVariable(variable), INITS);
    }

    public QUserNotification(Path<? extends UserNotification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserNotification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserNotification(PathMetadata metadata, PathInits inits) {
        this(UserNotification.class, metadata, inits);
    }

    public QUserNotification(Class<? extends UserNotification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notification = inits.isInitialized("notification") ? new umc.spring.domain.QNotification(forProperty("notification")) : null;
        this.user = inits.isInitialized("user") ? new umc.spring.domain.QUser(forProperty("user"), inits.get("user")) : null;
    }

}

