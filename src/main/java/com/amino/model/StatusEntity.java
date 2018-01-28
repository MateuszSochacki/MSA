package com.amino.model;

import javax.persistence.*;

@Entity
@Table(name = "STATUS", schema = "sql11218323", catalog = "")
@IdClass(StatusEntityPK.class)
public class StatusEntity {
    private int idStatus;
    private Double enjoyment;
    private Integer mal;
    private Double altmal;
    private Double overall;
    private Double ending;
    private String status;
    private int aminoIdAmino;
    private int profileIdProfile;
    private AminoEntity aminoByAminoIdAmino;
    private ProfileEntity profileByProfileIdProfile;

    @Id
    @Column(name = "idSTATUS")
    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    @Basic
    @Column(name = "enjoyment")
    public Double getEnjoyment() {
        return enjoyment;
    }

    public void setEnjoyment(Double enjoyment) {
        this.enjoyment = enjoyment;
    }

    @Basic
    @Column(name = "mal")
    public Integer getMal() {
        return mal;
    }

    public void setMal(Integer mal) {
        this.mal = mal;
    }

    @Basic
    @Column(name = "altmal")
    public Double getAltmal() {
        return altmal;
    }

    public void setAltmal(Double altmal) {
        this.altmal = altmal;
    }

    @Basic
    @Column(name = "overall")
    public Double getOverall() {
        return overall;
    }

    public void setOverall(Double overall) {
        this.overall = overall;
    }

    @Basic
    @Column(name = "ending")
    public Double getEnding() {
        return ending;
    }

    public void setEnding(Double ending) {
        this.ending = ending;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    @Column(name = "AMINO_idAMINO")
    public int getAminoIdAmino() {
        return aminoIdAmino;
    }

    public void setAminoIdAmino(int aminoIdAmino) {
        this.aminoIdAmino = aminoIdAmino;
    }

    @Id
    @Column(name = "PROFILE_idPROFILE")
    public int getProfileIdProfile() {
        return profileIdProfile;
    }

    public void setProfileIdProfile(int profileIdProfile) {
        this.profileIdProfile = profileIdProfile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusEntity that = (StatusEntity) o;

        if (idStatus != that.idStatus) return false;
        if (aminoIdAmino != that.aminoIdAmino) return false;
        if (profileIdProfile != that.profileIdProfile) return false;
        if (enjoyment != null ? !enjoyment.equals(that.enjoyment) : that.enjoyment != null) return false;
        if (mal != null ? !mal.equals(that.mal) : that.mal != null) return false;
        if (altmal != null ? !altmal.equals(that.altmal) : that.altmal != null) return false;
        if (overall != null ? !overall.equals(that.overall) : that.overall != null) return false;
        if (ending != null ? !ending.equals(that.ending) : that.ending != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStatus;
        result = 31 * result + (enjoyment != null ? enjoyment.hashCode() : 0);
        result = 31 * result + (mal != null ? mal.hashCode() : 0);
        result = 31 * result + (altmal != null ? altmal.hashCode() : 0);
        result = 31 * result + (overall != null ? overall.hashCode() : 0);
        result = 31 * result + (ending != null ? ending.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + aminoIdAmino;
        result = 31 * result + profileIdProfile;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "AMINO_idAMINO", referencedColumnName = "idAMINO", nullable = false)
    public AminoEntity getAminoByAminoIdAmino() {
        return aminoByAminoIdAmino;
    }

    public void setAminoByAminoIdAmino(AminoEntity aminoByAminoIdAmino) {
        this.aminoByAminoIdAmino = aminoByAminoIdAmino;
    }

    @ManyToOne
    @JoinColumn(name = "PROFILE_idPROFILE", referencedColumnName = "idPROFILE", nullable = false)
    public ProfileEntity getProfileByProfileIdProfile() {
        return profileByProfileIdProfile;
    }

    public void setProfileByProfileIdProfile(ProfileEntity profileByProfileIdProfile) {
        this.profileByProfileIdProfile = profileByProfileIdProfile;
    }
}
