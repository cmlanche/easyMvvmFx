package com.cmlanche.easymvvmfx.ui;

import javafx.stage.Stage;

/**
 * Created by cmlanche on 2016/12/9.
 * <p>
 * 全局单例
 */
public class GMain {

    private Stage primaryStage;

    private static class Holder {
        public static GMain gMain = new GMain();
    }

    private GMain() {
    }

    public static GMain getInstance() {
        return Holder.gMain;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
