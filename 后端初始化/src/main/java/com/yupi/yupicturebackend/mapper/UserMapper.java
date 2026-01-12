package com.yupi.yupicturebackend.mapper;

import com.yupi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
* @author wang
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2026-01-12 17:10:59
* @Entity com.yupi.yupicturebackend.model.entity.User
*/
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT COUNT(*) FROM user WHERE userAccount = #{userAccount}")
    long countUserAccountIgnoreLogicDelete(@Param("userAccount") String userAccount);
}




