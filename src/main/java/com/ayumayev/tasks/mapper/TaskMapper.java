package com.ayumayev.tasks.mapper;

import com.ayumayev.tasks.domain.dto.TaskDto;
import com.ayumayev.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
