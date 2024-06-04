// Write your code here

package com.example.todo;

import java.util.*;

public interface TodoRepository {
    ArrayList<Todo> getTodos();

    Todo addTodos(Todo todo);

    Todo getTodoById(int todoId);

    Todo updateTodo(int todoId, Todo todo);

    void deleteTodo(int TodoId);
}