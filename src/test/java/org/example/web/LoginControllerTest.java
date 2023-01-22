package org.example.web;

import org.example.service.AuthenticationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;

public class LoginControllerTest {

    private LoginController controller;

    private AuthenticationService service;

    @Before
    public void setUp() throws Exception {
        this.service = Mockito.mock(AuthenticationService.class);
        this.controller = new LoginController(this.service);

    }

    @Test
    public void testService_validUsernameAndPassword_logsInUser() {
        // arrange
        Mockito.when(this.service.authenticate(anyString(), anyString())).thenReturn(true);

        // act
        String viewPath = controller.service("simon","123");
        // assert
        assertNotNull(viewPath);
        System.out.println(viewPath);
        Assert.assertEquals("/home", viewPath);
    }
}