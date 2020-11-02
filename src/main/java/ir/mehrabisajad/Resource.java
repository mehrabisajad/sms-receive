package ir.mehrabisajad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@RestController
public class Resource {
    @GetMapping("/")
    public String receive(@RequestParam String code) throws FileNotFoundException {
        System.out.println(code);
        try (PrintWriter printWriter = new PrintWriter("/tmp/sms.txt")) {
            printWriter.println(code);
        }
        return code;
    }
}
