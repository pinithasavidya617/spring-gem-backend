package com.srilankagem.gembackend.gem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CertificateRequest {

    @NotBlank(message= "Certificate Number is required")
    private String certificateNumber;

    @NotNull(message= "Gem Id is required")
    private Long gemId;

    @NotBlank(message= "Issued by is required")
    private String issuedBy;

    @NotNull(message = "Issued Date is required")
    private LocalDate issuedDate;

    @NotNull(message = "Expiry Date is required")
    private LocalDate expiryDate;

    private String remarks;





}
