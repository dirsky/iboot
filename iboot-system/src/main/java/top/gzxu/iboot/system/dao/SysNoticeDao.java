package top.gzxu.iboot.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.gzxu.iboot.system.domain.SysNotice;

@Repository
public interface SysNoticeDao extends JpaRepository<SysNotice, Integer> {
}
