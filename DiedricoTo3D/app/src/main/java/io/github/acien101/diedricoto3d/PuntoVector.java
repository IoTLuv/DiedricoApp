package io.github.acien101.diedricoto3d;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by amil101 on 13/03/16.
 */
public class PuntoVector implements Parcelable{

    private double cota;
    private double alejamiento;
    private double distancia;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        out.writeDoubleArray(new double[]{this.cota,
                this.alejamiento,
                this.distancia});
    }

    public static final Parcelable.Creator<PuntoVector> CREATOR
            = new Parcelable.Creator<PuntoVector>() {
        public PuntoVector createFromParcel(Parcel in) {
            return new PuntoVector(in);
        }

        public PuntoVector[] newArray(int size) {
            return new PuntoVector[size];
        }
    };

    public PuntoVector(Parcel in) {
        double[] data = new double[3];

        in.readDoubleArray(data);
        this.cota = data[0];
        this.alejamiento = data[1];
        this.distancia = data[2];
    }

    public PuntoVector(double alejamiento, double cota, double distancia) {
        this.alejamiento = alejamiento;
        this.cota = cota;
        this.distancia = distancia;
    }

    public double getAlejamiento() {

        return alejamiento;
    }

    public void setAlejamiento(double alejamiento) {
        this.alejamiento = alejamiento;
    }

    public double getCota() {
        return cota;
    }

    public void setCota(double cota) {
        this.cota = cota;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}