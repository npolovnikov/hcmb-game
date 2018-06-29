package com.pologames.hcmb.admin;


import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.*;
import com.vaadin.ui.UI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class AdminUI extends UI {
    private final static Logger LOG = LoggerFactory.getLogger(AdminUI.class);

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        Page.getCurrent().setTitle("АРМ Администратор");

        final WebBrowser browser = Page.getCurrent().getWebBrowser();
        final StringBuilder bldr = new StringBuilder(100);
        bldr.append("New session: ");
        bldr.append("IP address='").append(browser.getAddress()).append("', ");
        bldr.append("paltform='").append(browser.getBrowserApplication()).append("', ");
        bldr.append("version='").append(browser.getBrowserMajorVersion()).append('.').append(browser.getBrowserMinorVersion()).append("', ");
        bldr.append("width='").append(browser.getScreenWidth()).append("', ");
        bldr.append("height='").append(browser.getScreenHeight()).append('\'');
        LOG.info(bldr.toString());

        setLocale(new Locale("ru", "RU"));

        //Настроим системные сообщения
        getReconnectDialogConfiguration().setDialogText("Соединение с сервером потеряно, ожидается восстановление ...");
        VaadinService.getCurrent().setSystemMessagesProvider(
                new SystemMessagesProvider() {
                    private static final long serialVersionUID = 5052645886090498888L;
                    @Override
                    public SystemMessages getSystemMessages(final SystemMessagesInfo systemMessagesInfo) {
                        final CustomizedSystemMessages messages = new CustomizedSystemMessages();
                        messages.setSessionExpiredCaption("Сессия завершена");
                        messages.setSessionExpiredMessage("Нажмите здесь или кнопку ESC для продолжения");
                        messages.setSessionExpiredNotificationEnabled(true);
                        return messages;
                    }
                });

        //Зарегистрируем 2 view - страница авторизации и UI администрирования
        final Navigator navigator = new Navigator(this, this);
//        navigator.addView(LoginView.NAME, LoginView.class);
        navigator.addView(AdministratorView.NAME, AdministratorView.class);

//        getNavigator().addViewChangeListener(new ViewChangeListener() {
//            private static final long serialVersionUID = -7910182453780421758L;
//            @Override
//            public boolean beforeViewChange(final ViewChangeListener.ViewChangeEvent event) {
//                boolean isLoggedIn = getSession().getAttribute("user") != null;
//                boolean isLoginView = event.getNewView() instanceof LoginView;
//                if (!isLoggedIn && !isLoginView) {
//                    getNavigator().navigateTo(LoginView.NAME);
//                    return false;
//                } else if (isLoggedIn && isLoginView) {
//                    return false;
//                }
//                return true;
//            }
//
//            @Override
//            public void afterViewChange(final ViewChangeListener.ViewChangeEvent event) {
//                //Ничего не делаем
//            }
//        });

        navigator.navigateTo(AdministratorView.NAME);
    }
}
