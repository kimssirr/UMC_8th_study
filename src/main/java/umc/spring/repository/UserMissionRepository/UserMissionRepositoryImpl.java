package umc.spring.repository.UserMissionRepository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.NumberExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import umc.spring.Dto.MissionDto;
import umc.spring.cursor.MissionCursor;
import umc.spring.domain.QMission;
import umc.spring.domain.QShop;
import umc.spring.domain.QUser;
import umc.spring.domain.enums.MissionStatus;
import umc.spring.domain.mapping.QUserMission;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserMissionRepositoryImpl implements UserMissionRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<MissionDto> findUserMissionsWithCursor(String username, MissionCursor cursor, int limit) {
        QUserMission userMission = QUserMission.userMission;
        QMission mission = QMission.mission;
        QShop shop = QShop.shop;
        QUser user = QUser.user;

        BooleanBuilder builder = new BooleanBuilder()
                .and(userMission.user.name.eq(username))
                .and(mission.missionStatus.in(MissionStatus.DOING, MissionStatus.DONE));

        // 커서 비교 조건
        if (cursor != null) {
            builder.and(
                    mission.missionPoints.lt(Integer.valueOf(cursor.missionPoints()))
                            .or(
                                    mission.missionPoints.eq(Integer.valueOf(cursor.missionPoints()))
                                            .and(mission.id.lt(cursor.missionId()))
                            )
            );
        }

        return queryFactory
                .select(Projections.constructor(
                        MissionDto.class,
                        mission.missionDescription,
                        mission.missionPoints,
                        shop.name,
                        Expressions.stringTemplate(
                                "'{0}'",
                                cursorFromFields(mission.missionPoints, mission.id)
                        )
                ))
                .from(userMission)
                .join(userMission.user, user)
                .join(userMission.mission, mission)
                .join(mission.shop, shop)
                .where(builder)
                .orderBy(mission.missionPoints.asc(), mission.id.asc())
                .limit(limit)
                .fetch();
    }

    @Override
    public List<MissionDto> findUserMissionsNewWithCursor(String username, MissionCursor cursor, int limit) {
        QUserMission userMission = QUserMission.userMission;
        QMission mission = QMission.mission;
        QShop shop = QShop.shop;
        QUser user = QUser.user;

        BooleanBuilder builder = new BooleanBuilder()
                .and(userMission.user.name.eq(username))
                .and(mission.missionStatus.in(MissionStatus.NEW));

        // 커서 비교 조건
        if (cursor != null) {
            builder.and(
                    mission.missionPoints.lt(Integer.valueOf(cursor.missionPoints()))
                            .or(
                                    mission.missionPoints.eq(Integer.valueOf(cursor.missionPoints()))
                                            .and(mission.id.lt(cursor.missionId()))
                            )
            );
        }

        return queryFactory
                .select(Projections.constructor(
                        MissionDto.class,
                        mission.missionDescription,
                        mission.missionPoints,
                        shop.name,
                        Expressions.stringTemplate(
                                "'{0}'",
                                cursorFromFields(mission.missionPoints, mission.id)
                        )
                ))
                .from(userMission)
                .join(userMission.user, user)
                .join(userMission.mission, mission)
                .join(mission.shop, shop)
                .where(builder)
                .orderBy(mission.missionPoints.asc(), mission.id.asc())
                .limit(limit)
                .fetch();
    }


    private Expression<String> cursorFromFields(NumberExpression<Integer> points, NumberExpression<Long> id) {
        return Expressions.stringTemplate(
                "LPAD({0},10,'0') || LPAD({1},10,'0')",
                points, id
        );
    }
}

