package com.newcapec.mapper;

import com.newcapec.entity.Dept;
import com.newcapec.entity.Emp;

import java.util.List;

/**
 * @InterfaceName EmpMapper
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月18日 14:43
 * @Version 1.0
 */
public interface DeptMapper {
    Dept selectDeptById(Integer id);

    List<Dept> selectAll();
}
