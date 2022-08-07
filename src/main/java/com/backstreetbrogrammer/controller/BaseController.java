package com.backstreetbrogrammer.controller;

import com.backstreetbrogrammer.EmailManager;
import com.backstreetbrogrammer.view.ViewFactory;

public abstract class BaseController {

    private final EmailManager emailManager;
    private final ViewFactory viewFactory;
    private final String fxmlName;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }
}
