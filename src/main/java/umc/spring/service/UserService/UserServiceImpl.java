package umc.spring.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.Dto.UserHomeInfoDto;
import umc.spring.Dto.UserMyPageInfoDto;
import umc.spring.repository.UserRepository.UserRepository;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public UserHomeInfoDto GetUserHomeInfo(String userName){
        return userRepository.findUserHomeInfoByUserName(userName);
    };

    @Override
    public UserMyPageInfoDto GetUserMyPageInfo(String userName){
        return userRepository.findUserMyPageInfoByUserName(userName);
    };
}
