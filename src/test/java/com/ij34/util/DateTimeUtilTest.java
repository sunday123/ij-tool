package com.ij34.util;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DateTimeUtilTest{
    @Test
    public void afterDateList(){
        DateTimeUtil.afterDateList(10).forEach(System.out::println);
    }
}