package ssm.dao;

import org.springframework.stereotype.Repository;
import ssm.entity.User;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Short id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}