package com.kknn.practice.pattern.delegate.mvc;

import com.kknn.practice.pattern.delegate.mvc.controllers.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kangfw5
 * @since 2019-06-30
 */
public class DispatcherServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<>();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //完成调度
        doDispatch(req, resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        Handler handler = null;
        for (Handler h : handlerMapping) {
            if (uri.equals(h.getUrl())) {
                handler = h;
                break;
            }
        }
        try {
            Object result = handler.getMethod().invoke(handler.getController(), req.getParameter("mid"));
            resp.getWriter().write(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void init() throws ServletException {
        Class<?> memberControllerClass = MemberController.class;
        try {
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", String.class))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class Handler {
        private Object controller;
        private Method method;
        private String url;
        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }

    /*private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");

        if ("getMemberById".equals(uri)) {
            new MemberController().getMemberById(mid);
        } else if ("getOrderById".equals(uri)) {
            new OrderController().getOrderById(mid);
        } else if ("logout".equals(uri)) {
            new SystemController().logout();
        } else {
            try {
                resp.getWriter().write("异常");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
}
