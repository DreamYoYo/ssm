package cn.qphone.ssm.service;

import cn.qphone.ssm.pojo.User;

import java.util.List;

public interface UserService {
    public User login(User user);
    public User get(int id);
    public boolean regist(User user);
    public List<User> list();
    public void deleteUser(int id);
    public void update(User user);
}
