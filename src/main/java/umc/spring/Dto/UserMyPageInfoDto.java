package umc.spring.Dto;

public class UserMyPageInfoDto {

    private String name;
    private String email;
    private String phoneNumber;
    private Integer points;

    public UserMyPageInfoDto(String name, String email, String phoneNumber, Integer points) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.points = points;
    }

    // getters, setters
}
