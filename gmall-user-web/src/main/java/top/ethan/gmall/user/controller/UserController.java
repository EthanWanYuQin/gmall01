package top.ethan.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.ethan.gmall.bean.UmsMember;
import top.ethan.gmall.bean.UmsMemberReceiveAddress;
import top.ethan.gmall.service.UserService;

import java.util.List;

/**
 * @author Ethan
 * @Date 2020/02/07 16:08
 */
@Controller
public class UserController {
    /**
     * 远程协议代理
     * 让Controller去消费配置再dubbo里的service
     */
    @Reference
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user ";
    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers=userService.getAllUser();
        return umsMembers;
    }


    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

}
