package umc.spring.service.UserMissionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.Dto.MissionDto;
import umc.spring.cursor.MissionCursor;
import umc.spring.repository.UserMissionRepository.UserMissionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserMissionServiceImpl implements UserMissionService {

    private final UserMissionRepository userMissionRepository;

    @Override
    public List<MissionDto> getUserMissions(String username, MissionCursor cursor, int limit) {
        return userMissionRepository.findUserMissionsWithCursor(username, cursor, limit);
    }
}
