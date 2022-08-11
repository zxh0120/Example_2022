package org.example.annotation.model;

import lombok.Data;
import org.example.annotation.InitSex;
import org.example.annotation.ValidateAge;

/**
 * @author zxh
 * @date 2022/7/14
 * @description 待处理的数据对象
 */
@Data
public class User {

    private String userName;

    @ValidateAge(min = 20, max = 35, value = 22)
    private int age;

    @InitSex(sex = InitSex.SEX_TYPE.MAN)

    private String sex;
}
