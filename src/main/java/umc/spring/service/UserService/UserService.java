package umc.spring.service.UserService;

import umc.spring.Dto.UserHomeInfoDto;
import umc.spring.Dto.UserMyPageInfoDto;

public interface UserService {

    UserHomeInfoDto GetUserHomeInfo(String userName);

    UserMyPageInfoDto GetUserMyPageInfo(String userName);
}
