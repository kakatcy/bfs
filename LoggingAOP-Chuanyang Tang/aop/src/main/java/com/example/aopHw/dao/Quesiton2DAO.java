package com.example.aopHw.dao;

import com.example.aopHw.domain.Question2;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class Quesiton2DAO {
    static List<Question2> list;
    static{
        list = new ArrayList<>();
        list.add(Question2.builder().id(1).title("1+1=?").ans(2).build());
        list.add(Question2.builder().id(2).title("1+2=?").ans(3).build());
        list.add(Question2.builder().id(3).title("1+3=?").ans(4).build());
    }

    public List<Question2> findAll(){return list;}

    public List<Question2> findById(Integer id){
        return list.stream().filter((u)->u.getId().equals(id)).collect(Collectors.toList());
    }
}
