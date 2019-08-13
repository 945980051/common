/**
 * 
 */
package com.sunshine.common.exception;

/**
 * @author 张梓枫
 * @Description 自定义业务异常类
 * @date:   2019年1月2日 上午9:48:49
 */
public class BLogicException extends RuntimeException{

    private static final long serialVersionUID = 4903001414576792342L;
    
    public BLogicException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public BLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public BLogicException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public BLogicException(Throwable cause) {
        super(cause);
    }

}
