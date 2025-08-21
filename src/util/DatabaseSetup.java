package util;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseSetup {
    public static void createTableIfNotExists() {
        String sql = """
            CREATE TABLE IF NOT EXISTS current_game (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                board TEXT NOT NULL,
                timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
            );
        """;

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela verificada/criada com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}
