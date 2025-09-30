/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example.boardgame.devops;

import java.util.*;

public class Catalog {
    private final Map<String, BoardGame> store = new HashMap<>();

    public void add(BoardGame game) {
        Objects.requireNonNull(game, "game não pode ser nulo");
        if (store.containsKey(game.getId())) {
            throw new IllegalArgumentException("Game com id já existe: " + game.getId());
        }
        store.put(game.getId(), game);
    }

    public Optional<BoardGame> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public boolean remove(String id) {
        return store.remove(id) != null;
    }

    public List<BoardGame> searchByName(String term) {
        if (term == null || term.isBlank()) return new ArrayList<>(store.values());
        String t = term.toLowerCase();
        List<BoardGame> result = new ArrayList<>();
        for (BoardGame g : store.values()) {
            if (g.getName().toLowerCase().contains(t)) result.add(g);
        }
        return result;
    }

    public List<BoardGame> all() {
        return new ArrayList<>(store.values());
    }
}
