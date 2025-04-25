package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.User;
import umc.spring.domain.comoon.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "region")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Region extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;

    @OneToMany(mappedBy = "region")
    private List<User> userList = new ArrayList<>();

    @OneToMany(mappedBy = "region")
    private List<Shop> shopList = new ArrayList<>();
}
