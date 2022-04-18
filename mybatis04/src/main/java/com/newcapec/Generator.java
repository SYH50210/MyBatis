package com.newcapec;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Generator
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月18日 15:56
 * @Version 1.0
 */
public class Generator {
    public static void main(String[] args) throws Exception {
        //是否覆盖已有文件
        boolean overwirte = true;
        DefaultShellCallback callback = new DefaultShellCallback(overwirte);
        List<String> warnings = new ArrayList<>();
        //创建配置解析类
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        InputStream in = Generator.class.getClassLoader().getResourceAsStream("generator.xml");
        Configuration configuration = configurationParser.parseConfiguration(in);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("代码生成成功...");
    }
}
