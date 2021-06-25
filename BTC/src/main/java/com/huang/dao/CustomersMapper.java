package com.huang.dao;

import com.huang.pojo.Customers;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

public interface CustomersMapper {

//    @Insert("insert into user (cName,cWeChat,cTel,api,secret,re,reY,reM,reNow) " +
//            "values (#{cName},#{cWeChat},#{cTel},#{api},#{secret},#{cTel})")
    int addCustomer(Customers customer);

//    @Delete("delete from user where Cid = #{Cid}")
    int deleteCustomersById(int Cid);

//    @Update("update user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updateCustomers(Customers customer);

//    @Select("select * from user where id = #{id}")
    Customers queryCustomer(int id);

//    @Select("select * from user")
    List<Customers> queryAllCustomers();

}
