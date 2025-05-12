package umc.spring.repository.ReviewRepository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import umc.spring.domain.QReview;
import umc.spring.domain.QUser;
import umc.spring.domain.User;

import java.time.LocalDateTime;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    private final QUser user = QUser.user;
    private final QReview review = QReview.review;

    @Override
    public void insertReviewByUserName(String userName, int rating, String content) {
        User foundUser = queryFactory
                .selectFrom(user)
                .where(user.name.eq("닉네임1234"))
                .fetchOne();

        if (foundUser == null) {
            throw new IllegalArgumentException("해당 유저가 존재하지 않습니다.");
        }

        queryFactory.insert(review)
                .columns(review.user, review.rating, review.content, review.createdAt)
                .values(foundUser, 5, "본문", LocalDateTime.now())
                .execute();

    }
}
