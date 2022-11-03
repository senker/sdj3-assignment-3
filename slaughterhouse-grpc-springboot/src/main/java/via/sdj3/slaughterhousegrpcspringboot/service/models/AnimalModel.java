package via.sdj3.slaughterhousegrpcspringboot.service.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "Animal")
public class AnimalModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    private AnimalType type;

    @NotNull
    private double weight;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="animal")
    private Set<AnimalPartModel> animalPartModels;

    public AnimalModel() { }

    public AnimalModel(AnimalType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public AnimalModel(Long id, AnimalType type, double weight) {
        this.id = id;
        this.type = type;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

enum AnimalType {
    CHICKEN,
    COW,
    PIG
}
