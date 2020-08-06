package cn.qphone.ssm.service.impl;

import cn.qphone.ssm.mapper.GroupsMapper;
import cn.qphone.ssm.pojo.Groups;
import cn.qphone.ssm.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupsServiceImpl implements GroupsService {

    @Autowired
    private GroupsMapper groupsMapper;

    public List<Groups> findGroupsList() {
        return groupsMapper.list();
    }
}
