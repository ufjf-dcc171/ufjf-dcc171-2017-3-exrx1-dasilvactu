/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017.aula8exemplo01;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ice
 */
public class Relampago {
    private String descricao;
    private float lat;
    private float longi;
    private Date dataHora;
    private List<Relampago> relampagos;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Relampago> getRelampagos() {
        return relampagos;
    }

    public void setRelampagos(List<Relampago> relampagos) {
        this.relampagos = relampagos;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLongi() {
        return longi;
    }

    public void setLongi(float longi) {
        this.longi = longi;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    
    public String toString() {
        return descricao;
    }
    
}
