package com.newcapec;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newcapec.entity.Emp;
import com.newcapec.mapper.EmpMapper;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName EmpTest
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月18日 17:09
 * @Version 1.0
 */
public class EmpTest {
    private SqlSession sqlSession;
    private EmpMapper empMapper;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
    }

    @Test
    public void testSelect() {
        List<Emp> emps = empMapper.select();
        for (Emp emp : emps) {
            System.out.println(emp.getEname()+","+emp.getJob()+","+emp.getDept().getDname());
        }
    }

    @Test
    public void testPage(){
        PageHelper.startPage(2,5);
        List<Emp> emps = empMapper.selectByPage();
        emps.forEach(System.out::println);

        PageInfo<Emp> pageInfo = new PageInfo<>(emps);
        System.out.println("当前页数：" + pageInfo.getPageNum());
        System.out.println("每页条数：" + pageInfo.getPageSize());
        System.out.println("总记录数：" + pageInfo.getTotal());
        System.out.println("总页数：" + pageInfo.getPages());
        System.out.println("上一页：" + pageInfo.getPrePage());
        System.out.println("下一页：" + pageInfo.getNextPage());
        System.out.println("是否有上一页：" + pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页：" + pageInfo.isHasNextPage());
        System.out.println("是否为首页：" + pageInfo.isIsFirstPage());
        System.out.println("是否为末页：" + pageInfo.isIsLastPage());
        System.out.println("存放页码的数据：" + Arrays.toString(pageInfo.getNavigatepageNums()));
        System.out.println("获取当前页数据：" + pageInfo.getList());
    }

    @After
    public void destroy() {
        sqlSession.close();
    }
}
