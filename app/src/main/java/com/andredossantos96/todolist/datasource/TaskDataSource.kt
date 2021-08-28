package com.andredossantos96.todolist.datasource

import com.andredossantos96.todolist.model.Task

object TaskDataSource {
    private val  list = arrayListOf<Task>()

    fun getList() = list

    fun insertTask(task: Task) {
        list.add(task.copy(id = list.size + 1))
    }
}