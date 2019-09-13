package top.gzxu.iboot.common.enums;

import org.junit.Test;

import static org.junit.Assert.*;


public class BusinessStatusEnumTest {
    @Test
    public void test() {
        System.out.println(BusinessStatusEnum.SUCCESS.ordinal());
        System.out.println(BusinessStatusEnum.FAIL);
    }

}