package cn.qphone.ssm.web.controller;

import cn.qphone.ssm.pojo.Groups;
import cn.qphone.ssm.pojo.User;
import cn.qphone.ssm.service.GroupsService;
import cn.qphone.ssm.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private GroupsService groupsService;


    @RequestMapping("/gotoLogin")
    public String gotoLogin() {
        return "forward:/login.jsp";
    }

    @RequestMapping("/gotoRegister")
    public String gotoRegister(Model model) {
        //一 查询所有的用户类型
        List<Groups> groupsList = groupsService.findGroupsList();
        model.addAttribute("glist", groupsList);
        //二 跳转页面
        return "forward:/register.jsp";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User user, Model model) {
        //一 校验用户名和密码非空
        String username = user.getUsername();
        String password = user.getPassword();

        if (StringUtils.isEmpty(username)) {
            String errorname = "用户名不能为空";
            model.addAttribute("errorname", errorname);
        }
        if (StringUtils.isEmpty(password)) {
            String errorpass = "密码不能为空";
            model.addAttribute("errorpass", errorpass);
        }

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return "forward:/user/gotoLogin";
        }

        //二 校验登录
        //1. 查询
        User login_user = userService.login(user);
        //2. 校验登录
        //2.1 为空
        if (null == login_user) {
            model.addAttribute("error", "登录出错，请检查你的用户名或密码！！！");
            return "forward:/user/gotoLogin";
        }
        //2.2 不为空
        model.addAttribute("user", login_user);
        return "forward:/user/main";
    }

    @RequestMapping("/main")
    public String main(Model model) {
        List<User> ulist = userService.list();
        model.addAttribute("ulist", ulist);
        return "forward:/main.jsp";
    }

    @RequestMapping("/doRegister")
    public String doRegister(User user, Model model) {
        //1. 注册
        boolean isok = userService.regist(user);
        if (isok) {
            model.addAttribute("msg", "注册成功");
            return "forward:/user/gotoLogin";
        } else {
            model.addAttribute("msg", "注册失败");
            return "forward:/user/gotoRegister";
        }
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(int id) {
        userService.deleteUser(id);
        return "forward:/user/main";
    }

    @RequestMapping("/editUser")
    public String editUser(int id, Model model) {
        User user = userService.get(id);
        model.addAttribute("user", user);

        List<Groups> groupsList = groupsService.findGroupsList();
        model.addAttribute("glist", groupsList);

        return "forward:/edit.jsp";
    }

    @RequestMapping("/update")
    public String update(User user) {
        userService.update(user);
        return "forward:/user/main";
    }
}
