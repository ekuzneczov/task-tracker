package org.example.tasktracker.mapper;

public interface Mapper<F, T> {

    T map(F object);
}
