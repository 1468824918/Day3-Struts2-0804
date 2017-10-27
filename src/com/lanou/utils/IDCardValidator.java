package com.lanou.utils;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * Created by dllo on 17/10/25.
 */
public class IDCardValidator extends FieldValidatorSupport{
    /**
     * 用来自定义验证规则
     * @param o  实际上就是某个Action的对象
     * @throws ValidationException
     */
    @Override
    public void validate(Object o) throws ValidationException {
        //获取需要验证的属性名字:实际上就是在配置文件中设置的field标签的name属性
        String fieldName = getFieldName();

        //获取action对象中该属性的值
        Object value = getFieldValue(fieldName,o);

        //数据类型合法的判断,必须是String类型
        if (value instanceof  String){
            String idcard = (String)value;
            //开始验证身份证号是否合法
            IDCard id = new IDCard();
            boolean result = id.Verify(idcard);
            if (!result) {
                //如果不是身份证号,添加错误信息
                addFieldError(fieldName,o);
            }
        }else {
            //不是字符串
            //直接添加错误信息
            addFieldError(fieldName,o);
        }

    }
}
