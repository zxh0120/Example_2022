package org.example.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author zxh
 * @date 2022/7/21
 * @description
 */
@Data
@ToString
@AllArgsConstructor
public class Apple {
    private Integer weightId;
    private String color;
    public String noThing;
    public Integer id;
}
