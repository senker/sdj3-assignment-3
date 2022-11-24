package via.sdj3.slaughterhousegrpcspringboot.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Animal")
public class AnimalModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    
    @NotNull
    private String type;

    @NotNull
    private double weight;

    @NotNull
    private String origin;

/*    @NotNull
    private LocalDate date;*/

    @OneToMany(cascade = CascadeType.ALL, mappedBy="animal")
    private Set<AnimalPartModel> animalPartModels;

    public AnimalModel() { }

    public AnimalModel(String type, double weight, String origin/*, LocalDate date*/) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;/*
        this.date = date;*/
    }

    public AnimalModel(Long id, String type, double weight, String origin/*, LocalDate date*/) {
        this.id = id;
        this.type = type;
        this.weight = weight;
        this.origin = origin;/*
        this.date = date;*/
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

/*    public LocalDate getDate() {
        return date;
    }*/

/*    public void setDate(LocalDate date) {
        this.date = date;
    }*/
}
