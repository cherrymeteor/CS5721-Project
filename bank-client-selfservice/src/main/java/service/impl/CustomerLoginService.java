package service.impl;

import javafx.util.converter.TimeStringConverter;
import model.*;
import rpc.*;
import rpc.client.CustomerLoginRpc;
import service.ICustomerLoginService;
import util.TimestampConvertHelper;

import java.util.ArrayList;
import java.util.List;

public class CustomerLoginService implements ICustomerLoginService {
    private static ICustomerLoginService instance = null;

    public static ICustomerLoginService getInstance() {
        if (instance == null) {
            return new CustomerLoginService();
        }
        return instance;
    }
    @Override
    public List<Integer> requestLoginUsingPhoneNum(UserLoginRequestModel userLoginRequestModel) throws Exception {
        UserLoginReqReply userLoginReqReply = CustomerLoginRpc.getInstance().loginReq(
                UserLoginReqRequest.newBuilder().setPhoneLast4(Integer.parseInt(userLoginRequestModel.getPhoneNumLast4())).
                        setUserId(userLoginRequestModel.getUserId()).build()
        );
        List<Integer> PinDigits = new ArrayList<>();
        initPinDigits(PinDigits, userLoginReqReply);
        return PinDigits;
    }
    @Override
    public List<Integer> requestLoginUsingDOB(UserLoginRequestModel userLoginRequestModel) throws Exception {
        UserLoginReqReply userLoginReqReply = CustomerLoginRpc.getInstance().loginReq(
                UserLoginReqRequest.newBuilder().setUserId(userLoginRequestModel.getUserId()).
                        setBirthDay(userLoginRequestModel.getDay()).
                        setBirthMon(userLoginRequestModel.getMonth()).
                        setBirthYear(userLoginRequestModel.getYear()).build()
        );
        List<Integer> PinDigits = new ArrayList<>();
        initPinDigits(PinDigits, userLoginReqReply);
        return PinDigits;
    }

    @Override
    public void requestLoginUsingPIN(UserLoginPINModel userLoginPINModel) throws Exception {
        CustomerLoginRpc.getInstance().login(
                UserLoginRequest.newBuilder().setUserId(userLoginPINModel.getUserId())
                        .setPin1(userLoginPINModel.getPin1())
                .setPin2(userLoginPINModel.getPin2())
                .setPin3(userLoginPINModel.getPin3())
                .setPin4(userLoginPINModel.getPin4())
                .setPin5(userLoginPINModel.getPin5())
                .setPin6(userLoginPINModel.getPin6())
                .build()
        );
    }

    @Override
    public void requestForgotUserId(UserForgotUserIdModel userForgotUserIdModel) throws Exception {
        CustomerLoginRpc.getInstance().forgotUserIdReq(
                UserForgetUserIdRequest.newBuilder().setFirstName(userForgotUserIdModel.getFirstName())
                .setLastName(userForgotUserIdModel.getLastName())
                .setBirthDate(TimestampConvertHelper.mysqlToRpc(userForgotUserIdModel.getBirthDate()))
                .setEmail(userForgotUserIdModel.getEmail())
                .setPhone(userForgotUserIdModel.getContactNum())
                .build()
        );


    }


    @Override
    public void requestForgotUserPIN(UserModel userModel) {

    }

    private void initPinDigits(List<Integer> PinDigits, UserLoginReqReply userLoginReqReply){
        if(userLoginReqReply.getPin1() == 1) {
            PinDigits.add(1);
        }
        if(userLoginReqReply.getPin2() == 1) {
            PinDigits.add(2);
        }
        if(userLoginReqReply.getPin3() == 1) {
            PinDigits.add(3);
        }
        if(userLoginReqReply.getPin4() == 1) {
            PinDigits.add(4);
        }
        if(userLoginReqReply.getPin5() == 1) {
            PinDigits.add(5);
        }
        if(userLoginReqReply.getPin6() == 1) {
            PinDigits.add(6);
        }
    }

}
