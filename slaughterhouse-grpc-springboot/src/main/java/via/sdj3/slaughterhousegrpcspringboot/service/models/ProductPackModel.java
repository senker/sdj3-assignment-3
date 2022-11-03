package via.sdj3.slaughterhousegrpcspringboot.service.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "ProductPack")
public class ProductPackModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @JoinTable(
        joinColumns = { @JoinColumn(name = "product_pack_id") },
        inverseJoinColumns = { @JoinColumn(name = "tray_id") }
    )
    @ManyToMany
    @NotNull
    Set<TrayModel> trays;

    public ProductPackModel() { }

    public ProductPackModel(Set<TrayModel> trays) {
        this.trays = trays;
    }

    public ProductPackModel(Long id, Set<TrayModel> trays) {
        this.id = id;
        this.trays = trays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<TrayModel> getTrays() {
        return trays;
    }

    public void setTrays(Set<TrayModel> trays) {
        this.trays = trays;
    }
}
