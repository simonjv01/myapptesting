package org.example.service;

import org.example.data.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AuthenticationServiceTest {

    private AuthenticationService service;
    private UserRepository userRepository;

    @Before
    public void setUp() {
        this.userRepository = Mockito.mock(UserRepository.class);
        this.service = new AuthenticationService(this.userRepository);

    }

    @Test
    public void testAuthenticate() {
        //arrange
        Mockito.when(this.userRepository.findByUserName(Mockito.anyString())).thenThrow(new IllegalArgumentException());

        // act
        this.service.authenticate("harry","harry1234");

        // assert
    }
}