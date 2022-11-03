package via.sdj3.slaughterhousegrpcspringboot.service.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "AnimalPart")
public class AnimalPartModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull
    private int partNumber;

    @NotNull
    private double partWeight;

    @NotNull
    private String type;

    @JoinColumn(name = "animal_id")
    @ManyToOne
    @NotNull
    AnimalModel animal;

    @JoinColumn(name = "tray_id")
    @ManyToOne
    @NotNull
    TrayModel tray;

    public AnimalPartModel() { }

    public AnimalPartModel(int partNumber, double partWeight, String type, AnimalModel animal) {
        this.partNumber = partNumber;
        this.partWeight = partWeight;
        this.type = type;
        this.animal = animal;
    }

    public AnimalPartModel(Long id, int partNumber, double partWeight, String type, AnimalModel animal) {
        this.id = id;
        this.partNumber = partNumber;
        this.partWeight = partWeight;
        this.type = type;
        this.animal = animal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public double getPartWeight() {
        return partWeight;
    }

    public void setPartWeight(double partWeight) {
        this.partWeight = partWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AnimalModel getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalModel animal) {
        this.animal = animal;
    }
}
