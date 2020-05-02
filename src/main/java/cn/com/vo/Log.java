package cn.com.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Log {
    private Integer id;

    private String operateor;

    private String operatetype;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date operatedate;

    private String operateresult;

    private String ip;
}