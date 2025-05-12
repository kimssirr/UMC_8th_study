package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.enums.NotificationType;
import umc.spring.domain.mapping.UserNotification;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "notification")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Notification extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    private String content;

    @OneToMany(mappedBy = "notification")
    private List<UserNotification> userNotificationList = new ArrayList<>();
}
