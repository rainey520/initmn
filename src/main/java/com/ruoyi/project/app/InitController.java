package com.ruoyi.project.app;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.framework.util.ShiroUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * APP 交互控制层
 *
 * @Author: Rainey
 * @Date: 2019/12/6 10:03
 * @Version: 1.0
 **/
@RequestMapping("/app")
@RestController
public class InitController {

    @RequestMapping("/demo")
    public AjaxResult demo(){
        System.out.println(ShiroUtils.getSysUser());
        return AjaxResult.success();
    }
}
