package com.staszek.javadev.controller;

import com.staszek.javadev.model.JavaDev;
import com.staszek.javadev.model.Student;
import com.staszek.javadev.repository.JavaDevRepository;
import com.staszek.javadev.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;

@Controller
public class JavaDevController {
    @Autowired
    JavaDevRepository javaDevRepository;
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/poZaloganiu")
    String poZalogowaniu() {
        return "emptyPanel";
    }

  /*  @PostMapping("/dodajWyklad")
    String dodajWyklad(
            @RequestParam("contentOfEntry") String contentOfEntry,
            @RequestParam("data") String data,
            @RequestParam("status") String status,
            @RequestParam("tape") String tape,
            @RequestParam("nameOfAcount") String nameOfAcount,

            Model model

    ) {
//        JavaDev users1 = JavaDevRepository.findByNameOfAcount(nameOfAcount).get();
//        Student student = new Student();
//        entry.setContentOfEntry(contentOfEntry);
//        entry.setData(data);
//        entry.setStatus(Enum.valueOf(StatusEntity.class, status));
//        entry.setTape(Enum.valueOf(TypeEntity.class, tape));
//        entry.setUsers(users1);
//
//        Set<Entry> entrySet = new HashSet<>();
//        entrySet.add(entry);
////        users.setEntries(entrySet);
////        entry.setUsers(users);
//
//        model.addAttribute("entry", entrySet);
////        model.addAttribute("users", users);
////
////        usersRepository.save(users);
//        entryRepository.save(entry);

//        List<Entry> entryListAfterAddingPost=entryRepository.findAll();
//        model.addAttribute("entryListAfterAddingPost",entryListAfterAddingPost );
//        return "updatedWall";

    }
*/

    @GetMapping("/dodajWyklad")
    String dodajWyklad() {
        return "newWyklad";
    }
}
