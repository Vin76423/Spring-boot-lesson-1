package com.example.calcresourse.dao;

import com.example.calcresourse.entity.Operation;

import java.util.List;

public interface OperationDao {
    void setOperation(Operation operation);
    List<Operation> showOperations();
}
