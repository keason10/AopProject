package gy.spring.learn.mybatismethod.typeHander;

import gy.spring.learn.mybatismethod.entity.DeliveryStatus;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.springframework.util.NumberUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by KEASON on 2017/6/10.
 */
public class DeliveryStatusTypeHander extends BaseTypeHandler<DeliveryStatus> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, DeliveryStatus deliveryStatus, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt( i,deliveryStatus.getValue());
    }

    @Override
    public DeliveryStatus getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return DeliveryStatus.valueOf(resultSet.getInt(s));
    }

    @Override
    public DeliveryStatus getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return DeliveryStatus.valueOf(resultSet.getInt(i));
    }

    @Override
    public DeliveryStatus getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return DeliveryStatus.valueOf(callableStatement.getInt(i));
    }
}
