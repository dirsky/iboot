package top.gzxu.iboot.system.domain;

import lombok.Data;
import top.gzxu.iboot.common.base.domain.BaseEntity;

import java.util.Date;

@Data
public class SysLoginInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long infoId;

    /** 用户账号 */
    private String loginName;

    /** 登录状态 0成功 1失败 */
    private String status;

    /** 登录IP地址 */
    private String ipaddr;

    /** 登录地点 */
    private String loginLocation;

    /** 浏览器类型 */
    private String browser;

    /** 操作系统 */
    private String os;

    /** 提示消息 */
    private String msg;

    /** 访问时间 */
    private Date loginTime;

}