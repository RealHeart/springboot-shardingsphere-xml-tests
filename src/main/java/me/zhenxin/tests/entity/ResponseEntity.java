package me.zhenxin.tests.entity;

import lombok.Data;

/**
 * Response Entity
 *
 * @author 真心
 * @since 2024/4/30 下午5:30
 */
@Data
public class ResponseEntity {
    private Integer code;
    private String message;
    private Object data;
}
