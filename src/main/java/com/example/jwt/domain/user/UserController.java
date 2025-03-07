package com.example.jwt.domain.user;

import com.example.jwt.domain.user.dto.LockUserDTO;
import com.example.jwt.domain.user.dto.UserDTO;
import com.example.jwt.domain.user.dto.UserMapper;
import com.example.jwt.domain.user.dto.UserRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> retrieveById(@PathVariable UUID id) {
        User user = userService.findById(id);
        return new ResponseEntity<>(userMapper.toDTO(user), HttpStatus.OK);
    }

    @GetMapping("/shoppy")
    @PreAuthorize("hasAuthority('CAN_SEE_STATISTICS')")
    @RolesAllowed({"ROLE_ADMIN"})
    public ResponseEntity<UserDTO> getShoppingQueen() {
        User shoppingQueen = userService.getShoppingQueen();
        return new ResponseEntity<>(userMapper.toDTO(shoppingQueen), HttpStatus.OK);
    }

    @GetMapping("/discount/1month")
    @PreAuthorize("hasAuthority('CAN_SEE_STATISTICS')")
    @RolesAllowed({"ROLE_ADMIN"})
    public ResponseEntity<Float> getDiscount() {
        Float discount = userService.getDiscount();
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }

    @PostMapping("/lock/{id}")
    @RolesAllowed({"ROLE_ADMIN"})
    public ResponseEntity<LockUserDTO> lockUser(@PathVariable UUID id) {
        User user = userService.lockUser(id);
        return new ResponseEntity<>(userMapper.toLockUserDTO(user), HttpStatus.CREATED);
    }

    @PostMapping("/unlock/{id}")
    @RolesAllowed({"ROLE_ADMIN"})
    public ResponseEntity<LockUserDTO> unlockUser(@PathVariable UUID id) {
        User user = userService.unlockUser(id);
        return new ResponseEntity<>(userMapper.toLockUserDTO(user), HttpStatus.CREATED);
    }


    @GetMapping({"", "/"})
    public ResponseEntity<List<UserDTO>> retrieveAll() {
        List<User> users = userService.findAll();
        return new ResponseEntity<>(userMapper.toDTOs(users), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@Valid @RequestBody UserRegisterDTO userRegisterDTO) {
        User user = userService.register(userMapper.fromUserRegisterDTO(userRegisterDTO));
        return new ResponseEntity<>(userMapper.toDTO(user), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('USER_MODIFY') && @userPermissionEvaluator.isUserAboveAge(authentication.principal.user,18)")
    public ResponseEntity<UserDTO> updateById(@PathVariable UUID id, @Valid @RequestBody UserDTO userDTO) {
        User user = userService.updateById(id, userMapper.fromDTO(userDTO));
        return new ResponseEntity<>(userMapper.toDTO(user), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('USER_DELETE')")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        userService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
