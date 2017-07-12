package biz.paluch.clean.architecture.contracts.repositories;

import biz.paluch.clean.architecture.applicationmodel.User;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @since 01.08.13 07:27
 */
public interface UserRepository {
    User find(String userName);

    void store(User user);
}
