package cn.qphone.ssm.service.impl;

import cn.qphone.ssm.mapper.EmpMapper;
import cn.qphone.ssm.pojo.Emp;
import cn.qphone.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    public List<Emp> findEmpList() {
        return empMapper.findEmpList();
    }

    public Emp get(Integer id) {
        return empMapper.get(id);
    }

    public void insert(Emp emp) {
        empMapper.insert(emp);
    }

    public void update(Emp emp) {
        empMapper.update(emp);
    }

    public void delete(Integer id) {
        empMapper.delete(id);
    }

    public void trans(Emp chen, Emp lee, double v) {
        //开启事务
        chen.setSalary(chen.getSalary() - v);
        lee.setSalary(lee.getSalary() + v);
        empMapper.update(chen);
        System.out.println(1/0);
        empMapper.update(lee);
        //没有异常，提交
        //catch()---> 回滚
    }
}
