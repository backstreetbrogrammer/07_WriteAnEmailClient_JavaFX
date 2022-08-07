package com.backstreetbrogrammer.view;

import com.backstreetbrogrammer.EmailManager;

public class ViewFactory {

    private final EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindow() {
        System.out.println("show login window called");
    }
}
