package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by JiaLe on 2021/5/16 12:00
 */
@Getter
@Setter
@ToString
public class Message {
    private Integer messageId;
    private Integer userId;
    private Integer channelId;
    private String content;
    private java.util.Date sentTime;


    private String nickName;
}
