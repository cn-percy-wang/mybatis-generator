<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
package ${basepackage}.service.mapper.auto.param;

import java.util.Date;

import lombok.Data;

/**
 * 
 * ${table.remarks} 数据创建参数
 * 
 * @author generator
 * @version ${now?string('yyyy-MM-dd HH:mm:ss')}
 */
@Data
public class ${className}InsertParam {

    <#list table.columns as column>
    <#if column.insertable && column.columnName != "CreateTime" && column.columnName != "LastUpdateTime">
    /**
     * ${column.remarks}
     */
    private ${column.simpleJavaType} ${column.columnNameLower};
    </#if>
    
    </#list>
}
