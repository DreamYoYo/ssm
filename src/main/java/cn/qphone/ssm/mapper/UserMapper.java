package cn.qphone.ssm.mapper;

import cn.qphone.ssm.pojo.User;

import java.util.List;

public interface UserMapper {
    public User get(String username);
    public User getUser(int id);
    public void insert(User user);
    public List<User> list();
    public void delete(int id);
    public void update(User user);
}
