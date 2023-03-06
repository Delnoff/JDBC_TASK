package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

        userDaoJDBC.createUsersTable();

        userDaoJDBC.saveUser("Sergey","Delnov", (byte) 22);
        userDaoJDBC.saveUser("Gena","Ivanov", (byte) 16);
        userDaoJDBC.saveUser("Artur","Sidorov", (byte) 30);
        userDaoJDBC.saveUser("Ivan","Petrov", (byte) 25);

        userDaoJDBC.getAllUsers();

        userDaoJDBC.cleanUsersTable();

        userDaoJDBC.dropUsersTable();
    }
}
