/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.opleiding.Home;

/**
 *
 * @author singh
 */
public class Vragen {

    private int id;
    private String vraag;
    private int opleidingId;
    private String vraagSoort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVraag() {
        return vraag;
    }

    public void setVraag(String vraag) {
        this.vraag = vraag;
    }

    public int getOpleidingId() {
        return opleidingId;
    }

    public void setOpleidingId(int opleidingId) {
        this.opleidingId = opleidingId;
    }

    public String getVraagSoort() {
        return vraagSoort;
    }

    public void setVraagSoort(String vraagSoort) {
        this.vraagSoort = vraagSoort;
    }

    
}
