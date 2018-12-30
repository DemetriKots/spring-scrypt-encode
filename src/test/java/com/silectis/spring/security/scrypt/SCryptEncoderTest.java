package com.silectis.spring.security.scrypt;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by dkotsiko on 2/20/16.
 */
public class SCryptEncoderTest {

    @Test
    public void matches() {
        SCryptEncoder enc = new SCryptEncoder();
        assertTrue(enc.isPasswordValid("400$8$36$78f4ae6983f76119$37ec6ce55a2b928dc56ff9a7d0cdafbd7dbde49d9282c38a40b1434e88f24cf5","my grand secret",  null));
        assertFalse(enc.isPasswordValid("400$8$36$78f4ae6983f76119$37ec6ce55a2b928dc56ff9a7d0cdafbd7dbde49d9282c38a40b1434e88f24cf5","My grand secret",  null));
    }

    @Test
    public void encode() {
        SCryptEncoder enc = new SCryptEncoder();
        assertTrue(enc.isPasswordValid(enc.encodePassword("test-password",null),"test-password", null));
    }
}
