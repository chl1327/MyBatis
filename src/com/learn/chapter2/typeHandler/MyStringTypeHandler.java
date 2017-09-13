package com.learn.chapter2.typeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.apache.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by chl1327 on 2017/7/23.
 */
@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringTypeHandler implements TypeHandler<String> {

    private Logger log = Logger.getLogger(MyStringTypeHandler.class);

    @Override
    public void setParameter(PreparedStatement ps,int index, String value, JdbcType jt) throws SQLException{
        log.info("Use My TypeHandler");
        ps.setString(index, value);
    }

    @Override
    public String getResult(ResultSet rs, String colName) throws SQLException{
        log.info("Use My TypeHandler, ResultSet colName String");
        return rs.getString(colName);
    }

    @Override
    public String getResult(ResultSet rs, int index) throws SQLException{
        log.info("Use My TypeHandler, ResultSet index String");
        return rs.getString(index);
    }

    @Override
    public String getResult(CallableStatement cs, int index)throws SQLException{
        log.info("Use My TypeHandler, CallableStatement index String");
        return cs.getString(index);
    }
}
