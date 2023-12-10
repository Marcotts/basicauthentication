package guru.springframework.basicauth.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TOUSLESFILMS")
public class TousLesFilms {

    @Id
    private BigInteger Id;

    @Column(name = "TITREFRANCAIS")
    private String titreFrançais;
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
    @Column(name = "ACT")
    private String act;
    @Column(name = "ANIM")
    private String anim;
    @Column(name = "AVEN")
    private String aven;
    @Column(name = "BIO")
    private String bio;
    @Column(name = "BONUS")
    private String bonus;
    @Column(name = "COM")
    private String com;
    @Column(name = "CRIME")
    private String crime;
    @Column(name = "DOC")
    private String doc;
    @Column(name = "DRAME")
    private String drame;
    @Column(name = "FANT")
    private String fant;
    @Column(name = "GUER")
    private String guer;
    @Column(name = "HIST")
    private String hist;
    @Column(name = "HOR")
    private String hor;
    @Column(name = "MUS")
    private String mus;
    @Column(name = "MYST")
    private String myst;
    @Column(name = "ROM")
    private String rom;
    @Column(name = "SCFI")
    private String sc_Fi;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "SPEC")
    private String spec;
    @Column(name = "SPORT")
    private String sport;
    @Column(name = "THRIL")
    private String thril;
    @Column(name = "WEST")
    private String west;
    @Column(name = "NOTE")
    private String note;
    @Column(name = "NOMBREDEVOTEURS")
    private String nombreDeVoteurs;
    @Column(name = "DUREE")
    private String duree;
    @Column(name = "PRODUCTEUR")
    private String producteur;
    @Column(name = "ENVEDETTE")
    private String enVedette;
    @Column(name = "AUDIOFRANCAIS")
    private String audioFrancais;
    @Column(name = "AUDIOANGLAIS")
    private String audioAnglais;
    @Column(name = "TRAITE")
    private String traite;
    @Column(name = "ENDOUBLE")
    private String enDouble;
    @Column(name = "DERNIEREPISODEVISIONNE")
    private String dernierEpisodeVisionne;
    @Column(name = "FILM3D")
    private String film3d;
    @Column(name = "ANNEESSAISON")
    private String anneesSaison;
    @Column(name = "DERNIERESAISON")
    private String derniereSaison;
    @Column(name = "PRODUITCREEPAR")
    private String produitCreePar;
    @Column(name = "ADRESSERESUME")
    private String adresseResume;
    @Column(name = "NOUVEAU")
    private String nouveau;
    @Column(name = "J")
    private String J;
    @Column(name = "K")
    private String K;
    @Column(name = "L")
    private String L;
    @Column(name = "M")
    private String M;
    @Column(name = "N")
    private String N;
    @Column(name = "O")
    private String O;
    @Column(name = "P")
    private String P;
    @Column(name = "Q")
    private String Q;
    @Column(name = "R")
    private String R;
    @Column(name = "S")
    private String S;
    @Column(name = "T")
    private String T;
    @Column(name = "U")
    private String U;
    @Column(name = "V")
    private String V;
    @Column(name = "W")
    private String W;
    @Column(name = "X")
    private String X;
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "Y")
    private String Y;
    @Column(name = "FILMETRANGER")
    private String filmEtranger;
    @Column(name = "MINISERIE")
    private String miniSerie;
    @Column(name = "Z")
    private String Z;
    @Column(name = "A")
    private String A;
    @Column(name = "B")
    private String B;
    @Column(name = "CATASTROPHE")
    private String catastrophe;
    @Column(name = "VERSIONORIGINALE")
    private String version_Originale;
    @Column(name = "C")
    private String C;
    @Column(name = "BESTIOLE")
    private String bestiole;
    @Column(name = "TOUS")
    private String tous;
    @Column(name = "VUE")
    private String vue;
    @Column(name = "PASVUE")
    private String pasVue;
    @Column(name = "ADRESSESERIES")
    private String adresseSeries;
    @Column(name = "COUPDECOEUR")
    private String coupDeCoeur;
    @Column(name = "SERIEENCOURS")
    private String serieEnCours;
    @Column(name = "SERIECOMPLETE")
    private String serieComplete;
    @Column(name = "ESPION")
    private String espion;
    @Column(name = "ANTIQUE")
    private String antique;
    @Column(name = "POLITIQUE")
    private String politique;
    @Column(name = "PROCES")
    private String proces;
    @Column(name = "SUPERHEROS")
    private String superHeros;
    @Column(name = "TUEURENSERIE")
    private String tueurEnSerie;
    @Column(name = "VAMPIRE")
    private String vampire;
    @Column(name = "ZOMBIE")
    private String zombie;
    @Column(name = "TERRORISTE")
    private String terroriste;
    @Column(name = "SORCELLERIE")
    private String sorcellerie;
    @Column(name = "ASIATIQUE")
    private String asiatique;
    @Column(name = "EROTIQUE")
    private String erotique;
    @Column(name = "NOUVEAUTE")
    private String nouveaute;
    @Column(name = "D")
    private String D;
    @Column(name = "SCIENTIFIQUE")
    private String scientifique;
    @Column(name = "ARCHEOLOGIE")
    private String archeologie;
    @Column(name = "MONVOTE")
    private String monVote;
    @Column(name = "COMMENTAIRESJULES")
    private String commentairesJules;
    @Column(name = "SOCIETE")
    private String societe;
    @Column(name = "RELIGION")
    private String religion;
    @Column(name = "FORMAT")
    private String format;
    @Column(name = "COMMENTAIRESGERALD")
    private String commentairesGerald;
    @Column(name = "qtp")
    private String qtp;
    @Column(name = "E")
    private String E;
    @Column(name = "NOUVCOMJULES")
    private String nouvComJules;
    @Column(name = "NOUVCOMGERALD")
    private String nouvComGerald;
    @Column(name = "EXTRATERRESTRE")
    private String extraterrestre;
    @Column(name = "SELECTIONDUJOUR")
    private String selectionDuJour;
}
