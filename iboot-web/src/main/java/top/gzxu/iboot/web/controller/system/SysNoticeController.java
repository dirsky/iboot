package top.gzxu.iboot.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.gzxu.iboot.system.dao.SysNoticeDao;
import top.gzxu.iboot.system.domain.SysNotice;

import java.util.Date;
import java.util.List;

/**
 * @author Frank
 */
@Controller
@RequestMapping("/system/notice")
public class SysNoticeController {

    private String prefix = "system/notice";

    @Autowired
    private SysNoticeDao sysNoticeDao;

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
