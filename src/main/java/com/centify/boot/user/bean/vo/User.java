package com.centify.boot.user.bean.vo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <pre>
 * <b>TODO</b>
 * <b>Describe:TODO</b>
 *
 * <b>Author: tanlin [2020/9/2 10:28]</b>
 * <b>Copyright:</b> Copyright 2008-2026 http://www.jinvovo.com Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   Ver   Date                  Author           Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2020/9/2 10:28        tanlin            new file.
 * <pre>
 */
@Data
@ToString
@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;
    private String name;
    private String itemd;
}
