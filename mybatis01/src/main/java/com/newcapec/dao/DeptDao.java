package com.newcapec.dao;

import com.newcapec.entity.Dept;

import java.util.List;

/**
 * @InterfaceName DeptDao
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月13日 16:33
 * @Version 1.0
 */
public interface DeptDao {
    /**
     * 查询所有部门
     * @author Sunyuhang
     * @date 2022/4/13 17:01 
     * @return java.util.List<com.newcapec.entity.Dept>
     */
    List<Dept> selectAll();
    
    /**
     * 查询单个部门
     * @author Sunyuhang
     * @date 2022/4/13 17:01
     * @param deptNo 
     * @return com.newcapec.entity.Dept
     */
    Dept selectDeptByDeptNo(Integer deptNo);

    /**
     * 模糊查询部门
     * @author Sunyuhang
     * @date 2022/4/13 17:01
     * @param dName
     * @return java.util.List<com.newcapec.entity.Dept>
     */
    List<Dept> selectDeptByDName(String dName);

    /**
     * 新增部门
     * @author Sunyuhang
     * @date 2022/4/13 17:02
     * @param dept
     * @return int
     */
    int insertDept(Dept dept);

    /**
     * 修改部门
     * @author Sunyuhang
     * @date 2022/4/13 17:02
     * @param dept
     * @return int
     */
    int updateDept(Dept dept);

    /**
     * 删除部门
     * @author Sunyuhang
     * @date 2022/4/13 17:02
     * @param deptNo
     * @return int
     */
    int deleteDept(Integer deptNo);
}
