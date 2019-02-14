package com.javarzn.annotation.life;

/**
 * Данный интерфейс реализуют сущности, которые должны возвращать свое название.
 *
 * @author Людмила СБТ 29.03.2017.
 */
public interface EntityName {
    /**
     * Возвращает имя сущности.
     *
     * @return имя сущности
     */
    String getHumanReadableName();
}
