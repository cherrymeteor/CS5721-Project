package dao;

import entity.UserEntity;

import java.sql.Timestamp;
import java.util.Map;

public interface IUserDao {
    UserEntity LoginByUserIdAndPin(Long userId, Map<Integer, Integer> pin);

    UserEntity selectUserByUserId(Long userId);

    UserEntity selectUserByUserIdEmailDOB(Long userId, String email, Timestamp timestamp);

    UserEntity selectUserById(Long id);

    UserEntity selectUserByNameDOBPhoneEmail(String firstName, String lastName, Timestamp birthDate, String phone, String email);

    Integer updateUserPinDigitById(Long id, String loginPinDigit);

    Integer updateUserPINByUserId(Long userId, String newPin);

    Integer updateUserStatusById(Long id, Integer status);

    Long selectTheBiggestId();

    UserEntity selectUserByIdAndName(Long parentUserId, String parentFirstName, String parentLastName);
}
