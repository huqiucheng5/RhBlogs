package com.rhb.rhblogs.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class MyPreferences {

    private static MyPreferences preferences;
    private SharedPreferences sharedPreferences;
    private static final String KEY_USER_NAME = "user_name";
    private static final String KEY_USER_EMAIL = "user_email";
    private static final String KEY_USER_TOKEN = "user_token";
    private static final String KEY_USER_SIGNATURE = "user_signature";
    private static final String KEY_USER_SEX = "user_sex";

    private MyPreferences(Context mContext) {
        sharedPreferences = mContext.getSharedPreferences("rhb_pref", Context.MODE_PRIVATE);
    }

    public static MyPreferences getPreferences(Context mContext) {
        if (null == preferences) {
            preferences = new MyPreferences(mContext);
        }
        return preferences;
    }

    public void setUserName(String userName) {
        sharedPreferences.edit().putString(KEY_USER_NAME, userName).commit();
    }

    public void setUserEmail(String email) {
        sharedPreferences.edit().putString(KEY_USER_EMAIL, email).commit();
    }

    public void setUserToken(String token) {
        sharedPreferences.edit().putString(KEY_USER_TOKEN, token).commit();
    }

    public void setUserSignature(String signature) {
        sharedPreferences.edit().putString(KEY_USER_SIGNATURE, signature).commit();
    }

    public void setUserSex(int sex) {
        sharedPreferences.edit().putInt(KEY_USER_SEX, sex).commit();
    }

    public String getUserName() {
        return sharedPreferences.getString(KEY_USER_NAME, "");
    }

    public String getUserEmail() {
        return sharedPreferences.getString(KEY_USER_EMAIL, "");
    }

    public String getUserToken() {
        return sharedPreferences.getString(KEY_USER_TOKEN, "");
    }

    public String getUserSignature() {
        return sharedPreferences.getString(KEY_USER_SIGNATURE, "");
    }

    public int getUserSex() {
        return sharedPreferences.getInt(KEY_USER_SEX, 0);
    }
}
