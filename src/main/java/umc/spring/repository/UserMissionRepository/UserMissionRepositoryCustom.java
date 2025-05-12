package umc.spring.repository.UserMissionRepository;

import umc.spring.Dto.MissionDto;
import umc.spring.cursor.MissionCursor;

import java.util.List;


public interface UserMissionRepositoryCustom {
    List<MissionDto> findUserMissionsWithCursor(String username, MissionCursor cursor, int limit);
    List<MissionDto> findUserMissionsNewWithCursor(String username, MissionCursor cursor, int limit);
}
