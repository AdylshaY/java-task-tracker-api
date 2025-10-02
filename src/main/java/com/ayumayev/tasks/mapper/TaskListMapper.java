package com.ayumayev.tasks.mapper;

import com.ayumayev.tasks.domain.dto.TaskListDto;
import com.ayumayev.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
