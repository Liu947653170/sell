package com.imoocn.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 *
 * @author jiale liu
 * @date 2019/2/12 15:09
 */
@Data
public class ResultVo<T> {

    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 具体内容
     */
    private T data;
}
