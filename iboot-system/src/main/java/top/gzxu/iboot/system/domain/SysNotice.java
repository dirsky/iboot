package top.gzxu.iboot.system.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import top.gzxu.iboot.common.base.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "sys_notice")
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class SysNotice extends BaseEntity
{
    private static final long serialVersionUID = 1L;
    /** 公告ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    private Integer noticeId;

    /** 公告标题 */
    @Column(name = "notice_title")
    private String noticeTitle;

    /** 公告类型（1通知 2公告） */
    @Column(name = "notice_type")
    private String noticeType;

    /** 公告内容 */
    @Column(name = "notice_content")
    private String noticeContent;

    /** 公告状态（0正常 1关闭） */
    @Column(name = "status")
    private String status;

}