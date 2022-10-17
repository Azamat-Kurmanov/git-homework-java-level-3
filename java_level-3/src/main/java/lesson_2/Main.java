package lesson_2;

import java.sql.*;

public class Main {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        try {
//            statement.execute("INSERT INTO students(name, score) VALUES('Alex1', 3)");

//            statement.execute("UPDATE students SET score = 100");

//            statement.execute("DELETE FROM students");

//            statement.execute("DROP TABLE if exists students");

            statement.execute("CREATE TABLE IF NOT EXISTS students(" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "score INTEGER)");

//            long time = System.currentTimeMillis();
//            connection.setAutoCommit(false);
//            for (int i = 0; i < 1000; i++) {
//                String name = String.format("Alex%d", i);
//                statement.execute(String.format("INSERT INTO students(name, score) VALUES('%s', 3)", name));
//            }

//            for (int i = 0; i < 1000; i++) {
//                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students(name, score) VALUES(?, ?)");
//                preparedStatement.setString(1, "Bob"+i);
//                preparedStatement.setInt(2, 200);
//                preparedStatement.execute();
//            }
//            connection.setAutoCommit(true);
//            System.out.println(System.currentTimeMillis() - time);

            ResultSet rs = statement.executeQuery("SELECT * FROM students");

            while(rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Score: " + rs.getInt(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            disconnect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:E:\\IdeaProjects\\git-homework-java-level-3\\java_level-3\\students.db");
        statement = connection.createStatement();
    }

    private static void disconnect() throws SQLException {
        connection.close();
    }
}
