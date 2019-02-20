package com.qfedu.utils;


import com.alibaba.fastjson.JSON;
import com.qfedu.vo.Bean;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class JsonUtil {
    public static void writeJsonStr(int code, Object info, HttpServletResponse response) {
        Bean bean = new Bean();
        bean.setCode(code);
        bean.setInfo(info);

        try {
            response.getWriter().write(JSON.toJSONString(bean));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
