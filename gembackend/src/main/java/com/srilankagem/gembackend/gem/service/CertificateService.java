package com.srilankagem.gembackend.gem.service;

import com.srilankagem.gembackend.common.exception.DuplicateResourceException;
import com.srilankagem.gembackend.gem.dto.CertificateRequest;
import com.srilankagem.gembackend.gem.dto.CertificateResponse;
import com.srilankagem.gembackend.gem.repository.CertificateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateService {
    private final CertificateRepository certificateRepository;

    @Autowired
    public  CertificateService(CertificateRepository certificateRepository){
        this.certificateRepository = certificateRepository;
    }

    public CertificateResponse certificateResponse (CertificateRequest request){
        if (certificateRepository.existsByCertificateNumber(request.getCertificateNumber())){
            throw new DuplicateResourceException("Certificate with this number already exists");
        }
        return null;
    }

}
