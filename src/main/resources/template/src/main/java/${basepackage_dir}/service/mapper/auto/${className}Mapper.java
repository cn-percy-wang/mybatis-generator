<#include "/java_copyright.include">
<#assign className = table.className>
package ${basepackage}.service.mapper.auto;

import java.util.List;

import ${basecommonpackage}.pager.PagedListData;
import ${basecommonpackage}.pager.PagerParam;
import ${basecommonpackage}.mapper.param.UpdateByIdParam;
import ${basepackage}.service.mapper.auto.dataobject.${className}DO;

/**
 * 
 * ${table.remarks}mybatis表操作mapper
 * 
 * @author generator
 * @version ${now?string('yyyy-MM-dd HH:mm:ss')}
 *
 */
public interface ${className}Mapper {

    /**
     * 查询所有记录
     * 
     * @return
     */
    public List<${className}DO> selectAll();

    /**
     * 分页查询所有记录
     * 
     * @param pagerParam
     * @return
     */
    public PagedListData<${className}DO> selectAll(PagerParam pagerParam);

    /**
     * 根据id查询单条记录
     * 
     * @param id
     * @return
     */
    public ${className}DO selectById(${table.idColumn.simpleJavaType} id);

    /**
     * 根据id删除单条记录
     * 
     * @param id
     */
    public void deleteById(${table.idColumn.simpleJavaType} id);

    /**
     * 插入数据，使用目标表所有字段
     * 
     * @param target
     */
    public void insert(Object target);

    /**
     * 根据id修改，使用目标表所有字段
     * 
     * @param updateByIdParam
     */
    public int updateById(UpdateByIdParam updateByIdParam);
    
}
