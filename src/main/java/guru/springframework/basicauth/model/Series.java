package guru.springframework.basicauth.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "SERIE1")
public class Series {

    @Id
    private BigInteger Id;

    @Column(name = "TITREFRANCAIS")
    private String titreFrancais;
    @Column(name = "TITREANGLAIS")
    private String titreAnglais;
    @Column(name = "ANNEE")
    private String annee;
    @Column(name = "POCHETTE")
    private String pochette;
    @Column(name = "DISQUEFRANCAIS")
    private String disqueFrancais;
    @Column(name = "DISQUEANGLAIS")
    private String disqueAnglais;
    @Column(name = "AUDIOFRANCAIS")
    private String audioFrancais;
    @Column(name = "AUDIOANGLAIS")
    private String audioAnglais;
    @Column(name = "ENDOUBLE")
    private String enDouble;
    @Column(name = "DERNIEREPISODEVISIONNE")
    private String dernierEpisodeVisionne;
    @Column(name = "ANNEESAISON")
    private String anneeSaison;
    @Column(name = "DERNIERESAISON")
    private String derniereSaison;
}
