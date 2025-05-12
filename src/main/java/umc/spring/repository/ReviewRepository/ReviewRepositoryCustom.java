package umc.spring.repository.ReviewRepository;

public interface ReviewRepositoryCustom {
    void insertReviewByUserName(String userName, int rating, String content);
}
