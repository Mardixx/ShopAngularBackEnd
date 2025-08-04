package com.mardixx.angularShop.repository;

import com.mardixx.angularShop.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    @Override
    <S extends UserModel> S save(S entity);

    @Override
    Optional<UserModel> findById(Long aLong);

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(UserModel userModel);
}
