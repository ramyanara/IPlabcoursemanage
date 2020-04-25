package net.javaguides.todoapp.user;
import java.sql.SQLException;
import java.util.List;


import net.javaguides.todoapp.model.User;
public interface UserDao {
	void insertTodo(User user) throws SQLException;
	List<User> selectAllTodos();
}
