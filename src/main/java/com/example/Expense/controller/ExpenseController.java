package com.example.Expense.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Expense.model.Expense;
import com.example.Expense.services.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
 private final ExpenseService service;

 

 public ExpenseController(ExpenseService service) {
     this.service = service;
 }

 @GetMapping
 public List<Expense> getAllExpenses() {
     return service.getAllExpenses();
 }

 @PostMapping
 public Expense createExpense(@RequestBody Expense expense) {
     return service.createExpense(expense);
 }

 @DeleteMapping("/{id}")
 public void deleteExpense(@PathVariable String id) {
     service.deleteExpense(id);
 }
}
