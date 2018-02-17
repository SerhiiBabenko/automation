package ua.com.stolkacha.utils.registrationUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ErrMsgs {

    @SerializedName("firstNameErrMsg")
    @Expose
    private String firstNameErrMsg;
    @SerializedName("lastNameErrMsg")
    @Expose
    private String lastNameErrMsg;
    @SerializedName("emailErrMsg")
    @Expose
    private String emailErrMsg;
    @SerializedName("passErrMsg")
    @Expose
    private String passErrMsg;
    @SerializedName("confPassErrMsg")
    @Expose
    private String confPassErrMsg;

    public String getFirstNameErrMsg() {
        return firstNameErrMsg;
    }

    public Collection<String> asList() {
        List<String> errMsgs = new ArrayList<>();
        errMsgs.add(firstNameErrMsg);
        errMsgs.add(lastNameErrMsg);
        errMsgs.add(emailErrMsg);
        errMsgs.add(passErrMsg);
        errMsgs.add(confPassErrMsg);
        return errMsgs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ErrMsgs)) return false;
        ErrMsgs errMsgs = (ErrMsgs) o;
        return Objects.equals(firstNameErrMsg, errMsgs.firstNameErrMsg) &&
                Objects.equals(lastNameErrMsg, errMsgs.lastNameErrMsg) &&
                Objects.equals(emailErrMsg, errMsgs.emailErrMsg) &&
                Objects.equals(passErrMsg, errMsgs.passErrMsg) &&
                Objects.equals(confPassErrMsg, errMsgs.confPassErrMsg);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstNameErrMsg, lastNameErrMsg, emailErrMsg, passErrMsg, confPassErrMsg);
    }
}