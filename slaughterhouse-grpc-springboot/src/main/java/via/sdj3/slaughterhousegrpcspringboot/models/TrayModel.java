package via.sdj3.slaughterhousegrpcspringboot.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "Tray")
public class TrayModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull
    private double maximumWeight;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="tray")
    @NotNull
    Set<AnimalPartModel> animalParts;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "trays")
    Set<ProductPackModel> productPacks;

    public TrayModel() { }

    public TrayModel(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public TrayModel(Long id, double maximumWeight) {
        this.id = id;
        this.maximumWeight = maximumWeight;
    }

    public TrayModel(double maximumWeight, Set<ProductPackModel> productPacks) {
        this.maximumWeight = maximumWeight;
        this.productPacks = productPacks;
    }

    public TrayModel(Long id, double maximumWeight, Set<ProductPackModel> productPacks) {
        this.id = id;
        this.maximumWeight = maximumWeight;
        this.productPacks = productPacks;
    }

    public Set<ProductPackModel> getProductPacks() {
        return productPacks;
    }

    public void setProductPacks(Set<ProductPackModel> productPacks) {
        this.productPacks = productPacks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public Set<AnimalPartModel> getAnimalParts() {
        return animalParts;
    }

    public void setAnimalParts(Set<AnimalPartModel> animalParts) {
        this.animalParts = animalParts;
    }
}
