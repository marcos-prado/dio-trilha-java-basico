package br.com.dio.service;

import br.com.dio.model.Board;
import br.com.dio.model.GameStatusEnum;
import br.com.dio.model.Space;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BoardService {

    private final static int BOARD_LIMIT = 9;

    private final Board board;

    public BoardService(final Map<String, String> gameConfig) {
        this.board = new Board(initBoard(gameConfig));
    }

    public List<List<Space>> getSpaces() {
        return board.getSpaces();
    }

    public void reset() {
        board.reset();
    }

    public boolean hasErrors() {
        return board.hasErrors();
    }

    public GameStatusEnum getStatus() {
        return board.getStatus();
    }

    public boolean gameIsFinished() {
        return board.gameIsFinished();
    }

    private List<List<Space>> initBoard(final Map<String, String> gameConfig) {
        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                String positionKey = String.format("%d,%d", i, j);
                String positionConfig = gameConfig.getOrDefault(positionKey, "0,DEFAULT_TYPE ");

                // Validação para evitar erros com configurações incorretas
                if (positionConfig == null || !positionConfig.matches("\\d+,\\w+")) {
                    /*System.out.println("Configuração inválida para posição: " + positionKey);*/
                    positionConfig = "0,DEFAULT_TYPE"; // Insere um valor padrão e evita a exceção
                }
                

                // Processamento das configurações
                String[] configParts = positionConfig.split(",");
                int expected = Integer.parseInt(configParts[0]);
                boolean fixed = Boolean.parseBoolean(configParts[1]);

                Space currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }
        return spaces;
    }
}