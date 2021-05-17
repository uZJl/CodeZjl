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
    //当前接口响应是否操作成功
    private boolean ok;
    //操作失败时，前端要展示的错误信息
    private String reason;
    //保存业务数据
    private Object data;
}
