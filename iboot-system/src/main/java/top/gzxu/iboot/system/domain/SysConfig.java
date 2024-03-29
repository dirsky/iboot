package top.gzxu.iboot.system.domain;

import lombok.Data;
import top.gzxu.iboot.common.base.domain.BaseEntity;

@Data
public class SysConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 参数主键 */
    private Long configId;

    /** 参数名称 */
    private String configName;

    /** 参数键名 */
    private String configKey;

    /** 参数键值 */
    private String configValue;

    /** 系统内置（Y是 N否） */
    private String configType;

}