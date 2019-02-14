package com.javarzn.annotation.life;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Сущность: Элемент справочника "Классификатор API".
 *
 * @author Юрий 09.02.2018
 */
@Getter
@Setter
@Entity
@EntityLabel("Классификатор API")
@Table(name = "API_CLASSIFIER")
@EqualsAndHashCode(exclude = "version")
@JsonIgnoreProperties({"humanReadableName", "hibernateLazyInitializer", "handler"})
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ApiClassifier implements EntityName {
    @Id
    @Column(name = "ID")
    @JsonView({ String.class })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "API_CLASSIFIER_SEQ")
    @GenericGenerator(strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", name = "API_CLASSIFIER_SEQ", parameters =
            {
                    @Parameter(name = "sequence_name", value = "API_CLASSIFIER_SEQ"),
                    @Parameter(name = "optimizer", value = "none"),
                    @Parameter(name = "initial_value", value = "50"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Version
    @Column(name = "VERSION")
    private long version;

    @NotNull
    @NotEmpty
    @Label("Наименование")
    @Size(max = 255)
    @Column(name = "NAME")
    @JsonView({ String.class })
    private String name;

    @Label("Описание")
    @Column(name = "DESCRIPTION")
    @JsonView({ String.class })
    private String description;

    @Override
    @Transient
    public String getHumanReadableName() {
        return name;
    }
}
