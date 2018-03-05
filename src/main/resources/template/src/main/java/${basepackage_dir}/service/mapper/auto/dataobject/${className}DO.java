<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.mapper.auto.dataobject;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import ${basecommonpackage}.pager.PagedData;
import ${basecommonpackage}.util.UUIDGenerator;
import ${basepackage}.service.mapper.auto.param.${className}InsertParam;
import ${basepackage}.service.mapper.auto.param.${className}UpdateParamTarget;

import lombok.Data;

/**
 * 
 * ${table.remarks} 数据库表映射
 * 
 * @author generator
 * @version ${now?string('yyyy-MM-dd HH:mm:ss')}
 *
 */
@Data
public class ${className}DO {

    <#list table.columns as column>
    /**
     * ${column.remarks}
     */
    private ${column.simpleJavaType} ${column.columnNameLower};
    </#list>

}
