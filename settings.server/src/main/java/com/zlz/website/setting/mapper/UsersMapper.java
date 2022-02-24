package com.zlz.website.setting.mapper;

import com.zlz.website.common.dos.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhulinzhong
 * @date 2022-02-24 17:48:29
 */
@Mapper
public interface UsersMapper {

    /**
     * 获取用户测试
     * @param name
     * @return
     */
    List<UserDO> getUsers(@Param("name") String name);
}
