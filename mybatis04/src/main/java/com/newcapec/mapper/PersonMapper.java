package com.newcapec.mapper;

import com.newcapec.entity.Emp;
import com.newcapec.entity.Person;

import java.util.List;

/**
 * @InterfaceName EmpMapper
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月18日 14:43
 * @Version 1.0
 */
public interface PersonMapper {
    Person selectPersonById(Integer id);
}
