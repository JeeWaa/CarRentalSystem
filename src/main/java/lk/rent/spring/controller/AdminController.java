package lk.rent.spring.controller;

import lk.rent.spring.dto.AdminDTO;
import lk.rent.spring.entity.Admin;
import lk.rent.spring.service.impl.AdminService;
import lk.rent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("admin")
@RestController
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveAdmin(@ModelAttribute AdminDTO admin) {
        adminService.saveAdmin(admin);
        return new ResponseUtil(200,"Saved",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateAdmin(@RequestBody AdminDTO admin) {
        adminService.updateAdmin(admin);
        return new ResponseUtil(200,"Updated",null);
    }

    @GetMapping(path = "/id",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchAdmin(@PathVariable String id) {
        return new ResponseUtil(200,"Updated",adminService.searchAdmin(id));
    }

}
