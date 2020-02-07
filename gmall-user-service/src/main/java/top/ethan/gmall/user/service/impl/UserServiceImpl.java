package top.ethan.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import top.ethan.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import top.ethan.gmall.user.mapper.UserMapper;
import top.ethan.gmall.bean.UmsMember;
import top.ethan.gmall.bean.UmsMemberReceiveAddress;
import top.ethan.gmall.service.UserService;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //注入UserMapper
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

//        List<UmsMember> umsMemberList=  userMapper.selectAllUser();
        List<UmsMember> umsMemberList=userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        Example e =new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses= umsMemberReceiveAddressMapper.selectByExample(e);
        return umsMemberReceiveAddresses;
    }
}
