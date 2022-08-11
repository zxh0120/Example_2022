package org.example.stream;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author zxh
 * @date 2022/7/27
 * @description
 */
@Data
@Accessors(chain = true)
@ToString
public class Money {
    private String fundCode;
    private String confirmMount;
    private String managerCharge;
    private String distributorCharge;
}
