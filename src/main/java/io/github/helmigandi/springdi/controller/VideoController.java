package io.github.helmigandi.springdi.controller;

import io.github.helmigandi.springdi.repository.VideoRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    /**
     * Constructor Injection
     * Tidak perlu ditambahkan @Autowired
     * jika constructornya hanya satu maka Spring sudah tahu untuk menggunakan @Autowired
     * Lihat Spring docs jika ingin mengetahui yang lebih dari satu constructor
     */
    private final VideoRepository repository;

    public VideoController(VideoRepository repository) {
        this.repository = repository;
    }

    public String next() {
        return "Next video";
    }
}
