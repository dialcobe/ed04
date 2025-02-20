
package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** La clase agenda permite agregar, eliminar o modificar
 * una lista de contactos junto a sus números de teléfonos
 */

public class Agenda implements AgendaInterface {
    private List<Persona> contacts;

    /** Constructor de la clase agenda.
     * Inicializa la lista de contactos
     */

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /** Agrega contactos a la agenda
     * Si los contactos ya existen, agrega el número de teléfono al contacto
     * @param name nombre del contacto
     * @param phone número de teléfono
     * */

    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /** Elimina contactos de la agenda
     * @param name número de teléfono
     * */

    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /** Modifica el número de teléfono del contacto
     * @param name Nombre del contacto
     * @param oldPhone Número antiguo
     * @param newPhone Número nuevo
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /** Obtiene la lista de contactos
     * @return lista de contactos
     */

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}