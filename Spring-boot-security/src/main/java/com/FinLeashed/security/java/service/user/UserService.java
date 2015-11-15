
package com.FinLeashed.security.java.service.user;

import java.util.Collection;
import java.util.Optional;

import com.FinLeashed.security.java.domain.User;
import com.FinLeashed.security.java.domain.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
