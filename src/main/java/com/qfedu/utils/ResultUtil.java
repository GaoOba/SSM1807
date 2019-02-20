package com.qfedu.utils;


import com.qfedu.comment.SystemCon;
import com.qfedu.vo.ResultVo;

public class ResultUtil {

    public static ResultVo exec(boolean istrue, String msg, Object data) {

        ResultVo resultVo = new ResultVo();
        if (istrue) {
            resultVo.setCode(SystemCon.OK);
        }else{
            resultVo.setCode(SystemCon.ERROR);
        }
        resultVo.setMsg(msg);
        resultVo.setData(data);
        return resultVo;

    }
}
