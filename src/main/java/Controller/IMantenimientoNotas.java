/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Note;
import java.time.LocalDateTime;
import java.util.TreeMap;

/**
 *
 * @author Carlos Fabricio
 */
public interface IMantenimientoNotas {
    void InsertNote();
    void addNote(Note note);
    void removeNote(LocalDateTime key);
    TreeMap<LocalDateTime, Note> getNoteMap();
}
