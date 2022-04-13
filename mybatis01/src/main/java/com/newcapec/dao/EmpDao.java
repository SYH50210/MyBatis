package com.newcapec.dao;

import com.newcapec.entity.Emp;

import java.util.List;

/**
 * @InterfaceName EmpDao
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月13日 15:13
 * @Version 1.0
 */
public interface EmpDao {

    /**
     * 根据员工编号查询
     *
     * @param empno
     * @return com.newcapec.entity.Emp
     * @author Sunyuhang
     * @date 2022/4/13 15:15
     */
    Emp selectEmpByEmpno(Integer empno);

    /**
     * 查询所有
     *
     * @return java.util.List<com.newcapec.entity.Emp>
     * @author Sunyuhang
     * @date 2022/4/13 15:14
     */
    List<Emp> selectAllEmp();

    /**
     * 模糊查询
     *
     * @return java.util.List<com.newcapec.entity.Emp>
     * @author Sunyuhang
     * @date 2022/4/13 15:14
     */
    List<Emp> selectEmpByName(String ename);

    /**
     * 新增员工
     *
     * @param emp
     * @return int
     * @author Sunyuhang
     * @date 2022/4/13 15:16
     */
    int insertEmp(Emp emp);

    /**
     * 更新员工
     *
     * @param emp
     * @return int
     * @author Sunyuhang
     * @date 2022/4/13 15:17
     */
    int updateEmp(Emp emp);

    /**
     * 删除员工
     *
     * @param empno
     * @return int
     * @author Sunyuhang
     * @date 2022/4/13 15:17
     */
    int deleteEmp(Integer empno);
}
