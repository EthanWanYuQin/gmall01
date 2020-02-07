package top.ethan.gmall.service;

import top.ethan.gmall.bean.UmsMember;
import top.ethan.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

}
