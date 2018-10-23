package com.sunny.mybatis.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunny
 * @class: com.sunny.boot.cherrytomato.generator.StartUp
 * @date: 2018-06-09 15:26
 * @des:
 */
public class StartUp {
    public static void main(String[] args) {
        try {
            //D:\code\java\ccclubs-ntsp-open-api\src\main\resources\generatorConfig.xml
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            String file = "D:\\code\\java\\generator-example\\src\\main\\resources\\generatorConfig.xml";
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(new File(file));
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (SQLException | IOException | InterruptedException | XMLParserException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
