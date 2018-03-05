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
public class ${className}UpdateParamTarget {

    <#list table.columns as column>
    <#if column.updatable && column.columnName != "CreateTime" && column.columnName != "LastUpdateTime" && column.columnName != "Id">
    /**
     * ${column.remarks}
     */
    private ${column.simpleJavaType} ${column.columnNameLower};
    </#if>
    
    </#list>
}
