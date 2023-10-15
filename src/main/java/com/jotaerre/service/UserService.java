package com.jotaerre.service;

import com.jotaerre.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
