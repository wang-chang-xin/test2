package com.lagou.dao;

import com.lagou.domain.ResourceCategory;
import com.lagou.domain.Role;
import com.lagou.domain.Role_menu_relation;
import com.lagou.domain.Role_resource_relation;

import java.util.List;

public interface RoleMapper {

    /*
        查询所有角色&条件进行查询
     */

    public List<Role> findAllRole(Role role);


    /*
        根据角色ID查询该角色关联的菜单信息ID [1,2,3,5]
     */
    public List<Integer> findMenuByRoleId(Integer roleid);


    /*
        根据roleid清空中间表的关联关系
     */
    public void deleteRoleContextMenu(Integer rid);


    /*
        为角色分配菜单信息
     */
    public void roleContextMenu(Role_menu_relation role_menu_relation);

    /*
        删除角色
     */

    public void deleteRole(Integer roleid);

    /*
    根据角色id获取当前角色拥有的资源分类id
     */
    public List<Integer> getResourceCategoryIdByRoleId(Integer id);

    /*
    根据资源分类id获取当前资源分类信息及其下的资源信息
     */
    public ResourceCategory getResourceCategoryByResourceCategoryId(Integer id);

    /*
    根据角色ID 删除角色与资源的关联关系
     */
    public void deleteRoleResourceRelation(Integer roleId);
    /*
    为角色分配最新的资源
     */
    public void saveNewRoleResourceRelation(Role_resource_relation role_resource_relation);
}
