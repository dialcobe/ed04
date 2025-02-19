package org.example;

import java.util.ArrayList;
import java.util.List;

/** Contacto con nombre y teléfonos asociados
 * */

class Contacto {
    private String name;
    private List<String> phones;

    /** Constructor que inicializa los atributos
     * del contacto
     * @param name Nombre del contacto
     * @param phone Número de tele´fono
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /** Obtiene el nombre del contacto
     * @return nombre del contacto
     * */

    public String getName() {
        return this.name;
    }

    /**Obtiene el número de teléfono
     * @return teléfono asociado
     * */
    public List<String> getPhones() {
        return this.phones;
    }
}