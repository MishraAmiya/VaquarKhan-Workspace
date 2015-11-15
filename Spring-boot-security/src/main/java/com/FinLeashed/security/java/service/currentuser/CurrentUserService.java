package com.FinLeashed.security.java.service.currentuser;

import com.FinLeashed.security.java.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
