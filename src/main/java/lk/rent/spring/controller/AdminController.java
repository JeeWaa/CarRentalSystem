package lk.rent.spring.controller;

import lk.rent.spring.entity.Admin;
import lk.rent.spring.service.impl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("admin")
@RestController
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping
    public void saveAdmin(@ModelAttribute Admin admin) {
        adminService.saveAdmin(admin);
    }

    @PutMapping
    public void updateAdmin(@RequestBody Admin admin) {
        adminService.updateAdmin(admin);
    }

    @GetMapping(path = {"/id"})
    public Admin searchAdmin(@PathVariable String id) {
        return adminService.searchAdmin(id);
    }

}
