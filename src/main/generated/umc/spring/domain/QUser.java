package umc.spring.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1348045193L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final umc.spring.domain.common.QBaseEntity _super = new umc.spring.domain.common.QBaseEntity(this);

    public final StringPath address = createString("address");

    public final DatePath<java.time.LocalDate> birthDate = createDate("birthDate", java.time.LocalDate.class);

    public final NumberPath<Integer> completedMissions = createNumber("completedMissions", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final EnumPath<umc.spring.domain.enums.Gender> gender = createEnum("gender", umc.spring.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QInquiry inquiry;

    public final StringPath name = createString("name");

    public final QNotificationSetting notificationSetting;

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Integer> points = createNumber("points", Integer.class);

    public final QRegion region;

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final ListPath<umc.spring.domain.mapping.UserCategory, umc.spring.domain.mapping.QUserCategory> userCategoryList = this.<umc.spring.domain.mapping.UserCategory, umc.spring.domain.mapping.QUserCategory>createList("userCategoryList", umc.spring.domain.mapping.UserCategory.class, umc.spring.domain.mapping.QUserCategory.class, PathInits.DIRECT2);

    public final ListPath<umc.spring.domain.mapping.UserMission, umc.spring.domain.mapping.QUserMission> userMissionList = this.<umc.spring.domain.mapping.UserMission, umc.spring.domain.mapping.QUserMission>createList("userMissionList", umc.spring.domain.mapping.UserMission.class, umc.spring.domain.mapping.QUserMission.class, PathInits.DIRECT2);

    public final ListPath<umc.spring.domain.mapping.UserNotification, umc.spring.domain.mapping.QUserNotification> userNotificationList = this.<umc.spring.domain.mapping.UserNotification, umc.spring.domain.mapping.QUserNotification>createList("userNotificationList", umc.spring.domain.mapping.UserNotification.class, umc.spring.domain.mapping.QUserNotification.class, PathInits.DIRECT2);

    public final ListPath<umc.spring.domain.mapping.UserTerms, umc.spring.domain.mapping.QUserTerms> userTermList = this.<umc.spring.domain.mapping.UserTerms, umc.spring.domain.mapping.QUserTerms>createList("userTermList", umc.spring.domain.mapping.UserTerms.class, umc.spring.domain.mapping.QUserTerms.class, PathInits.DIRECT2);

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUser(PathMetadata metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.inquiry = inits.isInitialized("inquiry") ? new QInquiry(forProperty("inquiry"), inits.get("inquiry")) : null;
        this.notificationSetting = inits.isInitialized("notificationSetting") ? new QNotificationSetting(forProperty("notificationSetting")) : null;
        this.region = inits.isInitialized("region") ? new QRegion(forProperty("region")) : null;
    }

}

