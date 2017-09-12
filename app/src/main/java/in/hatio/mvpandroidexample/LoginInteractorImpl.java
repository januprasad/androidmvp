package in.hatio.mvpandroidexample;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by jenuprasad on 11/09/17.
 */

class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener onLoginFinishedListener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (TextUtils.isEmpty(username)) {
                    onLoginFinishedListener.onUsernameError();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    onLoginFinishedListener.onPasswordError();
                    return;
                }
                onLoginFinishedListener.onSuccess();

            }
        }, 1400);
    }
}
