package ua.com.stolkacha.utils.registrationUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TestData {

    @SerializedName("userCredentials")
    @Expose
    private UserCredentials userCredentials;
    @SerializedName("errMsgs")
    @Expose
    private ErrMsgs errMsgs;

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }

    public ErrMsgs getErrMsgs() {
        return errMsgs;
    }

    public void setErrMsgs(ErrMsgs errMsgs) {
        this.errMsgs = errMsgs;
    }

}
