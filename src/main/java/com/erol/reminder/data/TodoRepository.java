package com.erol.reminder.data;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TodoRepository extends CrudRepository<UUID, TodoDO> {
}
