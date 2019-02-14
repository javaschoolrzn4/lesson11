package com.javarzn.annotation.life;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация, созданная для сохранения короткого текстового описания поля сущности на русском языке.
 * Используется для отображения понятного пользователю наименования конкретного поля сущности. Пример использования -
 * колонка "Параметр" в шаблоне _audit_event_log_details_popup.ftl (Аудит - Журнал аудита - Детали события).
 * <p>
 *
 * @author sbt-keglev-kn СБТ 19.09.2016
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface Label {
    public static final String EMPTY = "";
    
    String value() default EMPTY;
}