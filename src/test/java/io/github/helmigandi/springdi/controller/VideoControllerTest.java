package io.github.helmigandi.springdi.controller;

import io.github.helmigandi.springdi.repository.VideoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VideoControllerTest {

    /**
     * This is the instance because we don't have constructor available to us,
     * it's okay in this instance to use autowired field level injection.
     *
     * This case in a test it's okay.
     */
    @Autowired
    private VideoController controller;

    /**
     * Don't use Autowired in this repository
     * because we are solely focused on testing video controller here
     */
    @MockBean
    private VideoRepository repository;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(controller);
        Assertions.assertNotNull(repository);
    }
}
