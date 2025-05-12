package umc.spring.Dto;

public class UserHomeInfoDto {

    private Integer points;
    private Integer completedMissions;
    private String currentLocation;

    public UserHomeInfoDto(Integer points, Integer completedMissions, String currentLocation) {
        this.points = points;
        this.completedMissions = completedMissions;
        this.currentLocation = currentLocation;
    }
}
