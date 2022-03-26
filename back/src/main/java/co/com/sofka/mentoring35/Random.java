package co.com.sofka.mentoring35;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Random {
    private Date date;

    @Id
    private String id;

    //private String dominoList;

    private String ficha;

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //private String randomList;

    /*public String getRandomList() {
        return randomList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValurUno() {
        return valurUno;
    }

    public void setValurUno(String valurUno) {
        this.valurUno = valurUno;
    }

    public String getValorDos() {
        return valorDos;
    }

    public void setValorDos(String valorDos) {
        this.valorDos = valorDos;
    }

    public String getDominoList() {
        return dominoList;
    }

    public void setDominoList(String dominoList) {
        this.dominoList = dominoList;
    }

    public void setRandomList(String randomList) {
        this.randomList = randomList;
    }*/

    
}
