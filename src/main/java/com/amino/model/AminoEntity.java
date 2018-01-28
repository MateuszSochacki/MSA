package com.amino.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "AMINO", schema = "sql11218323", catalog = "")
public class AminoEntity {
    private int idAmino;
    private String name;
    private String description;
    private Date year;
    private Byte airing;

    @Id
    @Column(name = "idAMINO")
    public int getIdAmino() {
        return idAmino;
    }

    public void setIdAmino(int idAmino) {
        this.idAmino = idAmino;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "year")
    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Basic
    @Column(name = "airing")
    public Byte getAiring() {
        return airing;
    }

    public void setAiring(Byte airing) {
        this.airing = airing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AminoEntity that = (AminoEntity) o;

        if (idAmino != that.idAmino) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (airing != null ? !airing.equals(that.airing) : that.airing != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAmino;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (airing != null ? airing.hashCode() : 0);
        return result;
    }
}
