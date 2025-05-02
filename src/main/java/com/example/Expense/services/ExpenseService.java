package com.example.Expense.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Expense.model.Expense;
import com.example.Expense.repository.ExpenseRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ExpenseService {
    private final ExpenseRepository repository;

    @Autowired

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense createExpense(Expense expense) {
        expense.setId(UUID.randomUUID().toString()); 
        return repository.save(expense);
    }

    public void deleteExpense(String id) {
        repository.deleteExpenseById(id);
    }

    public Expense findExpenseById(String id) {
        return repository.findExpenseById(id);
    }

    public List<Expense> findExpensesByCategory(String category) {
        return repository.findByCategory(category);
    }

}
