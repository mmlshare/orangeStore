package com.mmlshare.base.http.annotation;

import com.mmlshare.base.http.HttpConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
//@ComponentScan(basePackages = {"com.mmlshare"})
@Import(HttpConfigure.class)
public @interface BaseHttp {
}
