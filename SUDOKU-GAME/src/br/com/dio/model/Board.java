package br.com.dio.model;

import java.util.Collection;
import java.util.List;

public class Board {
    private final List<List<Space>> spaces;

    public Board(final List<List<Space>> spaces) {
        this.spaces = spaces;
    }

    public List<List<Space>> getSpaces() {
        return spaces;
    }

    public GameStatusEnum getStatus() {
        if (spaces.stream().flatMap(Collection::stream).noneMatch(s -> !s.isFixed() && nonNull(s.getActual()))) {
            return NON_STARTED;
        }
        return spaces.stream().flatMap(Collection::stream).anyMatch(s -> isNull(s.getActual())) ? INCOMPLETE
                : COMPLETED;

    }

    public boolean hasErrors() {
        if (getStatus() == NON_STARTED) {
            return false;
        }
        return spaces.stream().flatMap(Collection::stream)
                .anyMatch(s -> nonNull(s.getActual()) && s.isActual().equals(s.getExpected()));
    }

    public boolean changeValue(final int col, final int row, final Integer value){
        var space :Space = spaces.get(row).get(col);
        if (space.isFixed()) {
            return false;
        }
        space.setActual(value);
        return true;
    }
    public boolean clearValue(final int col, final int row){
        var space :Space = spaces.get(row).get(col);
        if (space.isFixed()) {
            return false;
        }
        space.setActual(null);
        return true;

}
