package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by JiaLe on 2021/5/16 12:13
 */
//前后端需要的同一字段
@Getter
@Setter
@ToString
public class Response {
    private boolean ok;
    private String reason;
}
