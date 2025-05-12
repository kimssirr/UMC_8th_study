package umc.spring.repository.UserRepository;


import umc.spring.Dto.UserHomeInfoDto;
import umc.spring.Dto.UserMyPageInfoDto;

public interface UserRepositoryCustom {
    UserHomeInfoDto findUserHomeInfoByUserName(String userName);

    UserMyPageInfoDto findUserMyPageInfoByUserName(String userName);
}
