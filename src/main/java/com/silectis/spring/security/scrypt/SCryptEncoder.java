package com.silectis.spring.security.scrypt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.security.authentication.encoding.PasswordEncoder;
import com.lambdaworks.crypto.SCryptUtil;

/**
 * Created by dkotsiko on 2/20/16.
 */
public class SCryptEncoder implements PasswordEncoder {
    private final Log logger = LogFactory.getLog(getClass());

    public String encodePassword(String rawPassword, Object salt) {
        return SCryptUtil.scryptRuby(rawPassword, 1024, 8, 54);
    }

    public boolean isPasswordValid(String encodedPassword, String rawPassword, Object salt) {
        if (encodedPassword == null || encodedPassword.length() == 0) {
            logger.warn("Empty encoded password");
            return false;
        }
        logger.debug("About to compare them...");
        boolean res =  SCryptUtil.check(rawPassword, encodedPassword);
        logger.debug("Completed comparison");
        if (res) logger.info("Auth succeeded"); else logger.info("Auth failed");
        return res;
    }
}
