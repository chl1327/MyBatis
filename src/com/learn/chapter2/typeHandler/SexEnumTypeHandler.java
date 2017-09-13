package com.learn.chapter2.typeHandler;

import com.learn.chapter2.enums.Sex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by chl1327 on 2017/7/23.
 */
public class SexEnumTypeHandler implements TypeHandler<Sex> {
    @Override
    public Sex getResult(ResultSet rs, String name)throws SQLException{
        int id = rs.getInt(name);
        return Sex.getSex(id);
    }

    @Override
    public  Sex getResult(ResultSet rs, int index)throws SQLException{
        int id = rs.getInt(index);
        return Sex.getSex(id);
    }

    @Override
    public Sex getResult(CallableStatement cs, int index)throws SQLException{
        int id = cs.getInt(index);
        return Sex.getSex(id);
    }

    @Override
    public void setParameter(PreparedStatement ps, int index, Sex sex, JdbcType jdbcType)throws SQLException{
        ps.setInt(index,sex.getId());
    }
}
