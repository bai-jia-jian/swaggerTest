package cn.com.vo;


import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable{
    private static final long serialVersionUID = 3969438177161438988L;
    private String id;
    private String name;
}
