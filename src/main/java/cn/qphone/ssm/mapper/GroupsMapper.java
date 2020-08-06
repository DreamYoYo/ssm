package cn.qphone.ssm.mapper;

import cn.qphone.ssm.pojo.Groups;

import java.util.List;

public interface GroupsMapper {
    public List<Groups> list();
    public Groups get(Integer group_id);
    public void update(Groups groups);
}
