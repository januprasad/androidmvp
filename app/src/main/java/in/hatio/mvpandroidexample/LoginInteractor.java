package in.hatio.mvpandroidexample;

/**
 * Created by jenuprasad on 11/09/17.
 */

public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener onLoginFinishedListener);
}
