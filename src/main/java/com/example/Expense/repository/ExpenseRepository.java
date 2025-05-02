package com.example.Expense.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
   
    List<Expense> findByCategory(String category);

    Expense findExpenseById(String id);

    void deleteExpenseById(String id);


}
