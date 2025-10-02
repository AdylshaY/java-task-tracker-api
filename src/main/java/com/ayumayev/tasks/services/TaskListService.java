package com.ayumayev.tasks.services;

import com.ayumayev.tasks.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
}
