package com.Ecommerce_Multivendor.Backend.service.impl;


import com.Ecommerce_Multivendor.Backend.model.VerificationCode;
import com.Ecommerce_Multivendor.Backend.repository.VerificationCodeRepository;
import com.Ecommerce_Multivendor.Backend.service.VerificationService;
import org.springframework.stereotype.Service;

@Service
public class VerificationServiceImpl implements VerificationService {

    private final VerificationCodeRepository verificationCodeRepository;

    VerificationServiceImpl(VerificationCodeRepository verificationCodeRepository){

        this.verificationCodeRepository = verificationCodeRepository;
    }

    @Override
    public VerificationCode createVerificationCode(String otp, String email) {
        VerificationCode isExist=verificationCodeRepository.findByEmail(email);

        if(isExist!=null) {
            verificationCodeRepository.delete(isExist);
        }

        VerificationCode verificationCode=new VerificationCode();
        verificationCode.setOtp(otp);
        verificationCode.setEmail(email);

        return verificationCodeRepository.save(verificationCode);

    }
}
