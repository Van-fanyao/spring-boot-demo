package com.demo.mapper;

import com.demo.domain.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


@Repository
public interface UserMapper extends Mapper<User> , MySqlMapper<User> {
}
