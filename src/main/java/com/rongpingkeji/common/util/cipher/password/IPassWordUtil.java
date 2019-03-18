package com.rongpingkeji.common.util.cipher.password;

public interface IPassWordUtil {

    /**
     * 加密明文密码
     *
     * @param plainPassword 明文密码
     * @return
     */
    String encryptPassword(String plainPassword);


    /**
     * 验证密码
     *
     * @param plainPassword 明文密码
     * @param password      密文密码
     * @return
     */
    boolean validatePassword(String plainPassword, String password);
}
