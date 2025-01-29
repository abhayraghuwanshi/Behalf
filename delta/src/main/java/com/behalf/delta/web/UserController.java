package com.behalf.delta.web;


import com.behalf.delta.entity.UserInformation;
import com.behalf.delta.repo.UserInformationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.parameters.P;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UserController {

    private final UserInformationRepo userInformationRepo;

    @GetMapping("/me")
    public ResponseEntity<UserInformation> getUserInfo(@AuthenticationPrincipal OidcUser oidcUser) {

        Optional<UserInformation> userInformationOptional = userInformationRepo.findByEmail(oidcUser.getEmail());

        UserInformation userInfo;

        if (userInformationOptional.isEmpty()){
            userInfo = UserInformation.builder().email(oidcUser.getEmail())
                    .firstName(oidcUser.getGivenName()).lastName(oidcUser.getFamilyName()).picture(oidcUser.getPicture()).build();
            userInformationRepo.save(userInfo);
        } else {
            userInfo = userInformationOptional.get();
        }

        return ResponseEntity.ok(userInfo);
    }
}