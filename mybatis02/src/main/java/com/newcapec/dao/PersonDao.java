package com.newcapec.dao;

import com.newcapec.entity.Person;
import com.newcapec.entity.Stu;

import java.util.List;

/**
 * @InterfaceName PersonDao
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月14日 17:15
 * @Version 1.0
 */
public interface PersonDao {
    Integer getCount();

    Person getPersonById(Integer id);

    List<Person> selectAll();

    List<Stu> select();
}
