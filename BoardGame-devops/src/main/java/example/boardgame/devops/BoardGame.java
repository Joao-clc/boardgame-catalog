/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example.boardgame.devops;

import java.util.Objects;

public class BoardGame {
    private final String id;
    private String name;

    public BoardGame(String id, String name) {
        if (id == null || id.isBlank()) 
            throw new IllegalArgumentException("id obrigatório");
        if (name == null || name.isBlank()) 
            throw new IllegalArgumentException("nome obrigatório");
        this.id = id;
        this.name = name;
    }

    public String getId() { 
        return id; 
    }
    public String getName() { 
        return name; 
    }
    public void setName(String name) {
        if (name == null || name.isBlank()) 
            throw new IllegalArgumentException("nome obrigatório");
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoardGame)) 
            return false;
        BoardGame that = (BoardGame) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
