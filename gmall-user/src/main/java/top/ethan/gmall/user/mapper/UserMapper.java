package top.ethan.gmall.user.mapper;




import tk.mybatis.mapper.common.Mapper;
import top.ethan.gmall.bean.UmsMember;

import java.util.List;

/**
 * @author Ethan
 */
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();


}
