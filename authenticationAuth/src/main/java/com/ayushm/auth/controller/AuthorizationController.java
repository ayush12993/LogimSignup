package com.ayushm.auth.controller;

import com.ayushm.auth.model.login.User;
import com.ayushm.auth.repository.loginrepo.UserRepository;
import com.ayushm.auth.service.RoleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth/panel")
public class AuthorizationController {

    @Autowired
    RoleService roleService;

    @Autowired
    UserRepository userRepository;

    @Operation(
            summary = "Yo! Start creating Bot Check to see how the Api works! \nThis one only for testing Purposes!",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "404", description = "Unsuccessful"),
                    @ApiResponse(responseCode = "400", description = "UnSuccessful")
            }
    )
    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess(Authentication authentication) throws JsonProcessingException {
        return "User Content."+roleService.Authorization(authentication);
    }

    @Operation(
            summary = "Yo! Start creating Bot Check to see how the Api works! \nThis one only for testing Purposes!",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "404", description = "Unsuccessful"),
                    @ApiResponse(responseCode = "400", description = "UnSuccessful")
            }
    )
    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess(Authentication authentication) throws JsonProcessingException {
        return "Moderator Board."+roleService.Authorization(authentication);
    }

    @Operation(
            summary = "Yo! Start creating Bot Check to see how the Api works! \nThis one only for testing Purposes!",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "404", description = "Unsuccessful"),
                    @ApiResponse(responseCode = "400", description = "UnSuccessful")
            }
    )
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess(Authentication authentication) throws JsonProcessingException {
        return "Admin Board."+roleService.Authorization(authentication);
    }


}
