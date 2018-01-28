package com.amino.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class StatusEntityPK implements Serializable {
    private int idStatus;
    private int aminoIdAmino;
    private int profileIdProfile;

    @Column(name = "idSTATUS")
    @Id
    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    @Column(name = "AMINO_idAMINO")
    @Id
    public int getAminoIdAmino() {
        return aminoIdAmino;
    }

    public void setAminoIdAmino(int aminoIdAmino) {
        this.aminoIdAmino = aminoIdAmino;
    }

    @Column(name = "PROFILE_idPROFILE")
    @Id
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

        StatusEntityPK that = (StatusEntityPK) o;

        if (idStatus != that.idStatus) return false;
        if (aminoIdAmino != that.aminoIdAmino) return false;
        if (profileIdProfile != that.profileIdProfile) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStatus;
        result = 31 * result + aminoIdAmino;
        result = 31 * result + profileIdProfile;
        return result;
    }
}
