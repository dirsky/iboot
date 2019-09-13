package top.gzxu.iboot.system.domain;

import lombok.Data;
import top.gzxu.iboot.common.base.domain.BaseEntity;

import java.util.Date;
import java.util.List;

@Data
public class SysUser extends BaseEntity {
    private Long userId;
    private Long deptId;
    private Long deptParentId;
    private Long roleId;
    private String loginName;
    private String userName;
    private String email;
    private String phoneNumber;
    private String sex;
    private String avatar;
    private String password;
    private String salt;
    private String status;
    private String delFlag;
    private String lastIp;
    private Date lastDate;

    private SysDept dept;

    private List<SysRole> roles;

    /** 角色组 */
    private Long[] roleIds;

    /** 岗位组 */
    private Long[] postIds;
}
