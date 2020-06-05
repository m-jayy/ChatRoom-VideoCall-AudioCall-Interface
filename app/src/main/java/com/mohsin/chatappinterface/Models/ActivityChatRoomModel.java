package com.mohsin.chatappinterface.Models;

public class ActivityChatRoomModel {
    private String message;
    private boolean leMien;
    private String nameStr;
    private String date;
    private String ProfilePic;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isLeMien() {
        return leMien;
    }

    public void setLeMien(boolean leMien) {
        this.leMien = leMien;
    }

    public String getNameStr() {
        return nameStr;
    }

    public void setNameStr(String nameStr) {
        this.nameStr = nameStr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProfilePic() {
        return ProfilePic;
    }

    public void setProfilePic(String profilePic) {
        ProfilePic = profilePic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;


    public ActivityChatRoomModel(String nameStr, String message, boolean leMien, String ProfilePic, String status, String date) {
        this.message = message;
        this.leMien = leMien;
        this.ProfilePic = ProfilePic;
        this.nameStr = nameStr;
        this.date = date;
        this.status = status;
    }


}
