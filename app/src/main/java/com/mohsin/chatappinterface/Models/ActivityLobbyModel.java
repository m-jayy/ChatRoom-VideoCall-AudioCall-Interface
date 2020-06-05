package com.mohsin.chatappinterface.Models;


public class ActivityLobbyModel {
    String UserName;
    int UserProfileImg;
    String UserStatus;

    public ActivityLobbyModel(String userName, int userProfileImg, String userStatus) {
        UserName = userName;
        UserProfileImg = userProfileImg;
        UserStatus = userStatus;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getUserProfileImg() {
        return UserProfileImg;
    }

    public void setUserProfileImg(int userProfileImg) {
        UserProfileImg = userProfileImg;
    }

    public String getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(String userStatus) {
        UserStatus = userStatus;
    }
}
