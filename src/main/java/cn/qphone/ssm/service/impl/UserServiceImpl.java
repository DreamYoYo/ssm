package cn.qphone.ssm.service.impl;

import cn.qphone.ssm.mapper.GroupsMapper;
import cn.qphone.ssm.mapper.UserMapper;
import cn.qphone.ssm.pojo.Groups;
import cn.qphone.ssm.pojo.User;
import cn.qphone.ssm.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GroupsMapper groupsMapper;

    public User login(User user) {
        //1. 先根据用户名称去查询数据库这个用户名称是否存在
        if (null == user) return user;
        if (StringUtils.isNotEmpty(user.getUsername())) {
            //2. 去数据库中查询用户名
            User db_user = userMapper.get(user.getUsername());
            //3. 如果不为空，说明指定的用户是存储的
            if (null != db_user) {
                if (user.getPassword().equals(db_user.getPassword())) {
                    return db_user;
                }
            }
        }
        return null;
    }

    public User get(int id) {
        return userMapper.getUser(id);
    }

    public boolean regist(User user) {
        boolean isok = true;
        try {
            //1. 插入用户表一条记录
            userMapper.insert(user);
            //2. 根据用户的groupid更新groups表中的一条记录
            Groups groups = groupsMapper.get(user.getGroup_id());
            if (groups != null) groups.setUserNum(groups.getUserNum() + 1);
            groupsMapper.update(groups);
        }catch (Exception e) {
            e.printStackTrace();
            isok = false;
        }
        return isok;
    }

    public List<User> list() {
        return userMapper.list();
    }

    public void deleteUser(int id) {
        userMapper.delete(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }
}
