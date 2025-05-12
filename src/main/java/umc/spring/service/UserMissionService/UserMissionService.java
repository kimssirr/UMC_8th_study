package umc.spring.service.UserMissionService;

import umc.spring.Dto.MissionDto;
import umc.spring.cursor.MissionCursor;

import java.util.List;

public interface UserMissionService {
    List<MissionDto> getUserMissions(String username, MissionCursor cursor, int limit);
}
