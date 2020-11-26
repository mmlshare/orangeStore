package com.mmlshare.base.utils.text.json;

import com.alibaba.fastjson.JSONObject;

public final class FastJsonUtil {

    public static String obj2Json(Object object) {
        return JSONObject.toJSONString(object);
    }

    public static <T> T json2Obj(String json, Class<T> clazz) {
        return JSONObject.parseObject(json, clazz);
    }
}
