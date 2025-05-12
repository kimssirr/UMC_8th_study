package umc.spring.Dto;

public record MissionDto(
        String missionDescription,
        int missionPoints,
        String shopName,
        String cursor // 커서 문자열, e.g., "000000050000000123"
) {}

