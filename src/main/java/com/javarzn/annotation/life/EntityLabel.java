package com.javarzn.annotation.life;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация, созданная для сохранения короткого текстового описания сущности на русском языке.
 * Используется для отображения понятного пользователю наименования сущности. Пример использования -
 * колонка "Имя сущности" в шаблоне _audit_event_log_details_popup.ftl (Аудит - Журнал аудита - Детали события).
 *
 * @author sbt-keglev-kn СБТ 20.09.2016
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface EntityLabel {
    public static final String EMPTY = "";
    
    String value() default EMPTY;
}