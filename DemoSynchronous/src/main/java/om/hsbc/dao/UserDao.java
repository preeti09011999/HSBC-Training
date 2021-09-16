package om.hsbc.dao;

import com.hsbc.exception.UserAlreadyExistsException;

public interface UserDao {

	boolean checkIfUserNameExists(String username) throws UserAlreadyExistsException;
}

