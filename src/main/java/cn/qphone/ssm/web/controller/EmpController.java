package cn.qphone.ssm.web.controller;

import cn.qphone.ssm.pojo.Emp;
import cn.qphone.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/get")
    public String get(Integer id, Model model) {
        Emp emp = empService.get(id);
        model.addAttribute("emp", emp);
        return "forward:/emp.jsp";
    }
}
