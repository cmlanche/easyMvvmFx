package com.cmlanche.easymvvmfx.ui.login;

import com.fx.base.mvvm.BaseView;
import com.sun.javafx.scene.traversal.Algorithm;
import com.sun.javafx.scene.traversal.Direction;
import com.sun.javafx.scene.traversal.ParentTraversalEngine;
import com.sun.javafx.scene.traversal.TraversalContext;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

import java.math.BigDecimal;

/**
 * Created by cmlanche on 2016/12/9.
 */
public class LoginView extends BaseView<LoginViewModel> {

    @FXML
    Button btn;
    @FXML
    TextField t1;
    @FXML
    TextField t2;
    @FXML
    TextField t3;
    @FXML
    VBox testbox;


    @Override
    protected void onViewCreated() {

        BigDecimal b = new BigDecimal(204632000);
        System.out.println(b.doubleValue());

        BigDecimal a = new BigDecimal(b.doubleValue() - 100);
        System.out.println(a.toPlainString());

        t2.setFocusTraversable(true);
        t2.requestFocus();

        testbox.setImpl_traversalEngine(new ParentTraversalEngine(testbox, new Algorithm() {
            @Override
            public Node select(Node owner, Direction dir, TraversalContext context) {
                if ("t2".equals(owner.getId())) {
                    return t3;
                } else if ("t3".equals(owner.getId())) {
                    return t1;
                } else if ("t1".equals(owner.getId())) {
                    return btn;
                } else {
                    return t2;
                }
            }

            @Override
            public Node selectFirst(TraversalContext context) {
                return t2;
            }

            @Override
            public Node selectLast(TraversalContext context) {
                return t1;
            }
        }));
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
