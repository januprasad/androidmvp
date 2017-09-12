package in.hatio.mvpandroidexample;

/**
 * Created by jenuprasad on 11/09/17.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();

}
