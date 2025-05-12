package umc.spring.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationSetting is a Querydsl query type for NotificationSetting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationSetting extends EntityPathBase<NotificationSetting> {

    private static final long serialVersionUID = -2001430855L;

    public static final QNotificationSetting notificationSetting = new QNotificationSetting("notificationSetting");

    public final umc.spring.domain.common.QBaseEntity _super = new umc.spring.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<umc.spring.domain.enums.ToggleOption> eventNotifications = createEnum("eventNotifications", umc.spring.domain.enums.ToggleOption.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<umc.spring.domain.enums.ToggleOption> inquiryReplyNotifications = createEnum("inquiryReplyNotifications", umc.spring.domain.enums.ToggleOption.class);

    public final EnumPath<umc.spring.domain.enums.ToggleOption> reviewReplyNotifications = createEnum("reviewReplyNotifications", umc.spring.domain.enums.ToggleOption.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QNotificationSetting(String variable) {
        super(NotificationSetting.class, forVariable(variable));
    }

    public QNotificationSetting(Path<? extends NotificationSetting> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationSetting(PathMetadata metadata) {
        super(NotificationSetting.class, metadata);
    }

}

