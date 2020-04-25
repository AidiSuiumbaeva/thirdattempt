package kg.megacom.secondattempt.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping(value = "/file")
public class FileController {

    @Value("${img.path}")
    private String dirPath;


@PostMapping("/load")
    public void upload(@RequestParam MultipartFile file){

    Path path= Paths.get(dirPath+file.getOriginalFilename());

    try {
        Files.write(path,file.getBytes());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
