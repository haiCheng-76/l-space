package website.lhc.lspace.system.menu.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单管理表
 * </p>
 *
 * @author 龙海成
 * @since 2020-03-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SpMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单编号
     */
    private Integer menuId;

    /**
     * 父编号
     */
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 地址
     */
    private String url;

    /**
     * 授权(多个用逗号分隔，
如：user:list,user:create)
     */
    private String perms;

    /**
     * 类型 0：目录 1：菜
单 2：按钮
     */
    private Boolean type;

    /**
     * 图标
     */
    private String icon;

    /**
     * 排序
     */
    private Integer orderNum;


}
