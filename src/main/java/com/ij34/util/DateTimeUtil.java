package com.ij34.util;

import cn.hutool.core.date.DateUtil;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Description DateUtil
 * Date 2021/12/19
 * Created by www.ij34.com
 */
public class DateTimeUtil {
    /**
     * 获得n天后的日期
     *
     * @param n 后n天
     * @return 日期List
     * @since 1.0
     */
    public static List<Date> afterDateList(int n) {
        List<Date> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(DateUtil.offsetDay(DateUtil.date(), i));
        }
        return list;
    }
}
