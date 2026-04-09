package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    void whenPositionFigure() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell expected = bishopBlack.position();
        assertThat(expected).isEqualTo(Cell.C8);
    }

    @Test
    void whenCopyFigure() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure expected = bishopBlack.copy(Cell.F8);
        assertThat(expected.position()).isEqualTo(Cell.F8);
    }

    @Test
    void whenWayFigure() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = bishopBlack.way(Cell.G5);
        assertThat(expected).isEqualTo(new Cell[]{
                Cell.D2,
                Cell.E3,
                Cell.F4,
                Cell.G5}
        );
    }
}