package com.scccy.stgy.common.untils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {
    private static final Pattern PHONE_PATTERN = Pattern.compile("^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,2-9]))\\d{8}$");

    public static boolean isValidChineseMobileNumber(String phone) {
        if (phone == null || phone.isEmpty()) {
            return false;
        }
        Matcher matcher = PHONE_PATTERN.matcher(phone);
        return matcher.matches();
    }
}