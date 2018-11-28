package com.common.user.service;

import com.common.user.viewobject.UserBasicInfoVo;

public interface UserService {

    public boolean accountExistCheck(UserBasicInfoVo userVo);

    public boolean mobileExistCheck(UserBasicInfoVo userVo);

    public UserBasicInfoVo userRegist(UserBasicInfoVo userVo);

    public UserBasicInfoVo userLogin(UserBasicInfoVo userVo);

    public UserBasicInfoVo modifyUserBasicInfo(UserBasicInfoVo userVo);

    public UserBasicInfoVo getUserBasicInfoVoById(String userId);
}
