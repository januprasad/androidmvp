package in.hatio.mvpandroidexample;

/**
 * Created by jenuprasad on 11/09/17.
 */

class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {
    LoginView lView;
    LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView lView) {
        this.lView = lView;
        loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (lView != null) {
            lView.showProgress();
            loginInteractor.login(username, password, this);
        }
    }

    @Override
    public void onUsernameError() {
        if (lView != null) {
            lView.hideProgress();
            lView.setUsernameError();
        }
    }

    @Override
    public void onPasswordError() {
        if (lView != null) {
            lView.hideProgress();
            lView.setPasswordError();
        }
    }

    @Override
    public void onSuccess() {
        if (lView != null) {
            lView.hideProgress();
            lView.navigateToHome();
        }
    }
}
