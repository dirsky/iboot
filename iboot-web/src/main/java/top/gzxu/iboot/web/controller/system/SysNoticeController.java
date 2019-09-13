package top.gzxu.iboot.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gzxu.iboot.system.dao.SysNoticeDao;
import top.gzxu.iboot.system.domain.SysNotice;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/system/notice")
public class SysNoticeController {

    @Autowired
    private SysNoticeDao sysNoticeDao;

    @GetMapping("/list")
    public List<SysNotice>  list() {
        List<SysNotice> list = sysNoticeDao.findAll();
        return list;
    }

    @GetMapping("/edit/{id}")
    public SysNotice one(@PathVariable("id") Integer id) {
        System.out.println(id);
        SysNotice notice = sysNoticeDao.getOne(id);
        notice.setNoticeContent("this is new!");
        notice.setUpdateTime(new Date());
        sysNoticeDao.save(notice);


        return sysNoticeDao.getOne(id);
    }
}
