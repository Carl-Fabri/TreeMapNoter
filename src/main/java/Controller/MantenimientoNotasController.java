/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Note;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.TreeMap;

/**
 *
 * @author Carlos Fabricio
 */
public class MantenimientoNotasController implements IMantenimientoNotas{
    
    private TreeMap<LocalDateTime, Note> noteMap;

    public MantenimientoNotasController() {
        noteMap = new TreeMap<>();
    }
    
    public void InsertNote(){
        noteMap.put(LocalDateTime.of(2023, 1, 1, 12, 0), new Note("Dia 1", "El dia comenzo caido como el caudal de una catarata.", LocalDateTime.of(2023, 1, 1, 12, 0), LocalDateTime.of(2023, 1, 1, 12, 0)));
        noteMap.put(LocalDateTime.of(2022, 1, 2, 11, 50), new Note("Dia 2", "Hay golpes en la vida, tan fuertes yo no se, golpes como el odio de...", LocalDateTime.of(2022, 1, 2, 11, 50), LocalDateTime.of(2022, 1, 2, 11, 50)));
        noteMap.put(LocalDateTime.of(2021, 6, 2, 9, 50), new Note("Dia 3", "De pronto nace toda aquella esperanza, nace tu sonrisa.", LocalDateTime.of(2021, 6, 2, 9, 50), LocalDateTime.of(2021, 6, 2, 9, 50)));
        noteMap.put(LocalDateTime.of(2020, 3, 19,2,20), new Note("Dia 4", "Anelado recuerdo de persona nostalgico, aparece ante mi y dame la esperanza....", LocalDateTime.of(2020, 3, 19,2,20), LocalDateTime.of(2020, 3, 19,2,20)));
    }

    public void addNote(Note note) {
        noteMap.put(note.getCreateAt(), note);
    }
    
    public void removeNote(LocalDateTime key) {
        noteMap.remove(key);
    }

    public TreeMap<LocalDateTime, Note> getNoteMap() {
        return noteMap;
    }
}
