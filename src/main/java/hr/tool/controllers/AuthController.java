package hr.tool.controllers;

import hr.tool.dto.JsonLogin;
import hr.tool.dto.JsonRegister;
import hr.tool.security.JwtUtil;
import hr.tool.services.CustomUserDetailsService;
import hr.tool.services.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final RegisterService registerService;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody JsonLogin request) {

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtil.generateToken(request.getEmail());
        return ResponseEntity.ok(jwt);
    }

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody JsonRegister json) {
        return ResponseEntity.ok(registerService.register(json));
    }
}