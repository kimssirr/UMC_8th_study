package umc.spring.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.comoon.BaseEntity;
import umc.spring.domain.enums.ToggleOption;



@Entity
@Table(name = "notification_setting")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class NotificationSetting extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ToggleOption eventNotifications = ToggleOption.ON;

    @Enumerated(EnumType.STRING)
    private ToggleOption reviewReplyNotifications = ToggleOption.ON;

    @Enumerated(EnumType.STRING)
    private ToggleOption inquiryReplyNotifications = ToggleOption.ON;
}