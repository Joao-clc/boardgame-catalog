/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example.boardgame.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatalogTest {

    @Test
    void adicionaERecuperaJogo() {
        Catalog catalog = new Catalog();
        BoardGame jogo = new BoardGame("BG1", "Catan");

        catalog.add(jogo);

        assertTrue(catalog.findById("BG1").isPresent());
        assertEquals("Catan", catalog.findById("BG1").get().getName());
    }

    @Test
    void naoPermiteDuplicados() {
        Catalog catalog = new Catalog();
        catalog.add(new BoardGame("BG1", "Catan"));

        assertThrows(IllegalArgumentException.class, () -> {
            catalog.add(new BoardGame("BG1", "Carcassonne"));
        });
    }
}
