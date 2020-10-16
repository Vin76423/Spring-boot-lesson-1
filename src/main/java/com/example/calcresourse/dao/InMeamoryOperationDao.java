package com.example.calcresourse.dao;

import com.example.calcresourse.entity.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMeamoryOperationDao implements OperationDao {
    private final List<Operation> OPERATIONS = new ArrayList<>();

    @Override
    public void setOperation(Operation operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Argument 'operation' is null!");
        }
        OPERATIONS.add(operation);
    }

    @Override
    public List<Operation> showOperations() {
        return null;
    }
}
