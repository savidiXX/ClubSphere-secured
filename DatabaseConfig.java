package com.mycompany.clubsphere.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseConfig {
    private static HikariDataSource dataSource;

    static {
        try {
            // DB_URL and DB_USER fall back to local defaults; DB_PASSWORD is required.
            String url = System.getenv().getOrDefault(
                    "DB_URL",
                    "jdbc:mysql://localhost:3307/event_management?useSSL=false&allowPublicKeyRetrieval=true");
            String user = System.getenv().getOrDefault("DB_USER", "root");
            String password = System.getenv("DB_PASSWORD");

            if (password == null) {
                throw new IllegalStateException(
                        "DB_PASSWORD environment variable is not set. See the Configuration section in README.md.");
            }

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(url);
            config.setUsername(user);
            config.setPassword(password);
            config.setDriverClassName("com.mysql.cj.jdbc.Driver");

            config.setMaximumPoolSize(10);
            config.setMinimumIdle(2);
            config.setPoolName("ClubSpherePool");

            dataSource = new HikariDataSource(config);

        } catch (Exception e) {
            System.err.println("DatabaseConfig static init failed: "
                               + e.getClass().getName() + " - " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize HikariCP", e);
        }
    }

    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}
