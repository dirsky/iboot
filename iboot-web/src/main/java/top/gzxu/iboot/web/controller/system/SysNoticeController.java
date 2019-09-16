package top.gzxu.iboot.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.gzxu.iboot.system.dao.SysNoticeDao;
import top.gzxu.iboot.system.domain.SysNotice;

import java.util.*;

/**
 * @author Frank
 */
@Controller
@RequestMapping("/system/notice")
public class SysNoticeController {

    private String prefix = "system/notice";

    @Autowired
    private SysNoticeDao sysNoticeDao;

    @GetMapping("/test")
    public String test(Map<String, Object> paramMap) {
        /** 默认Map的内容会放大请求域中，页面可以直接使用Thymeleaf取值*/
        paramMap.put("name", "徐国忠");
        paramMap.put("age", 18);

        List<String> list = new ArrayList<String>();
        list.add("1s");
        list.add("2s");
        list.add("3s");
        paramMap.put("list",list);

        List<ChannelItem> channels = new ArrayList<>();
        channels.add(new ChannelItem(1, "frank"));
        channels.add(new ChannelItem(2, "candy"));
        channels.add(new ChannelItem(3, "dog"));

        paramMap.put("channels", channels);

        return prefix + "/test";
    }
    @GetMapping()
    public String notice() {
        return prefix + "/notice";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<SysNotice>  list() {
        List<SysNotice> list = sysNoticeDao.findAll();
        return list;
    }

    @GetMapping("/edit/{id}")
    @ResponseBody
    public SysNotice one(@PathVariable("id") Integer id) {
        System.out.println(id);
        SysNotice notice = sysNoticeDao.getOne(id);
        notice.setNoticeContent("this is new!");
        notice.setNoticeTitle("中文标题");
        notice.setUpdateTime(new Date());
        sysNoticeDao.save(notice);


        return sysNoticeDao.getOne(id);
    }
}


class ChannelItem {
    private Integer id;
    private String name;

    public ChannelItem(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
