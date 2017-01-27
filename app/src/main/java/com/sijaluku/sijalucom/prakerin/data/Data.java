package com.sijaluku.sijalucom.prakerin.data;

/**
 * Created by SijaluCom on 1/20/2017.
 */
public class Data {
    private String id, tanggal, uraian;

    public Data() {
    }

    public Data(String id, String tanggal, String uraian) {
        this.id = id;
        this.tanggal = tanggal;
        this.uraian = uraian;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getUraian() {
        return uraian;
    }

    public void setUraian(String uraian) {
        this.uraian = uraian;
    }


}
