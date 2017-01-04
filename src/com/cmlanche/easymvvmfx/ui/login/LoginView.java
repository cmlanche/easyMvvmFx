package com.cmlanche.easymvvmfx.ui.login;

import com.fx.base.mvvm.BaseView;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 * Created by cmlanche on 2016/12/9.
 */
public class LoginView extends BaseView<LoginViewModel> {


    @Override
    protected void onViewCreated() {

    }

    @FXML
    public void onTray(MouseEvent event) {
        String title = "Congratulations sir";
        String message = "You've successfully created your first Tray Notification";
        NotificationType notification = NotificationType.SUCCESS;

        TrayNotification tray = new TrayNotification();
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setNotificationType(notification);
        tray.showAndWait();
    }
}
