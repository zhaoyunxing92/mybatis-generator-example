/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.mybatis.utils;

import java.util.regex.Pattern;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.mybatis.utils.StringUtils
 * @date: 2018-08-20 17:26
 * @des:
 */
public class StringUtils {
    private StringUtils() {
    }

    /**
     * 是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
