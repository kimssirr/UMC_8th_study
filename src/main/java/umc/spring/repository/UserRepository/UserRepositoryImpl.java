package umc.spring.repository.UserRepository;


import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.core.types.Projections;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import umc.spring.Dto.UserHomeInfoDto;
import umc.spring.Dto.UserMyPageInfoDto;
import umc.spring.domain.QRegion;
import umc.spring.domain.QUser;
import umc.spring.domain.mapping.QUserMission;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public UserRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public UserHomeInfoDto findUserHomeInfoByUserName(String userName) {
        QUser user = QUser.user;
        QRegion map = QRegion.region;
        QUserMission userMission = QUserMission.userMission;

        return queryFactory
                .select(Projections.constructor(UserHomeInfoDto.class,
                        user.points,
                        user.completedMissions,
                        map.location))
                .from(user)
                .join(user.region, map)
                .where(user.eq(
                        JPAExpressions
                                .select(userMission.user)
                                .from(userMission)
                                .where(userMission.user.eq(
                                        JPAExpressions
                                                .select(user)
                                                .from(user)
                                                .where(user.name.eq(userName))
                                ))
                ))
                .fetchOne();
    }

    public UserMyPageInfoDto findUserMyPageInfoByUserName(String userName) {
        QUser user = QUser.user;

        return queryFactory
                .select(Projections.constructor(UserMyPageInfoDto.class,
                        user.name,
                        user.email,
                        user.phoneNumber,
                        user.points))
                .from(user)
                .where(user.name.eq(userName))
                .fetchOne();
    }


}
