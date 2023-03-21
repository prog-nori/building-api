package com.example.building.api.controllers;

import com.example.building.api.domain.Structure;
import com.example.building.api.service.StructureService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/structure")
public class StructureController {

    @Autowired
    public StructureService service;

    @GetMapping("/get")
    public List<Structure> findAll() {
        List<Structure> structures = service.selectAll();
        return structures;
    }

    @GetMapping("/find/{id}")
    public List<Structure> findById(
            @PathVariable int id
    ) {
        List<Structure> structures = service.findById(id);
        return structures;
    }

    @GetMapping("/find")
    public List<Structure> find(
            @RequestParam(value = "id", required = false) int id,
            @RequestParam(value = "w", required = false) int w,
            @RequestParam(value = "al", required = false) int al,
            @RequestParam(value = "s-light", required = false) int sLight,
            @RequestParam(value = "s-heavy", required = false) int sHeavy,
            @RequestParam(value = "rc", required = false) int rc,
            @RequestParam(value = "src", required = false) int src,
            @RequestParam(value = "cft", required = false) int cft,
            @RequestParam(value = "cb", required = false) int cb,
            @RequestParam(value = "others", required = false) String others
    ) {
        Structure aStructure = new Structure(id, w, al, sLight, sHeavy, rc, src, cft, cb, others);
        List<Structure> structures = service.find(aStructure);
        return structures;
    }

    @GetMapping("/add")
    public void add(
            @RequestParam(value = "id") int id,
            @RequestParam(value = "w", required = false) int w,
            @RequestParam(value = "al", required = false) int al,
            @RequestParam(value = "s-light", required = false) int sLight,
            @RequestParam(value = "s-heavy", required = false) int sHeavy,
            @RequestParam(value = "rc", required = false) int rc,
            @RequestParam(value = "src", required = false) int src,
            @RequestParam(value = "cft", required = false) int cft,
            @RequestParam(value = "cb", required = false) int cb,
            @RequestParam(value = "others", required = false) String others
    ) {
        Structure aStructure = new Structure(id, w, al, sLight, sHeavy, rc, src, cft, cb, others);
        service.add(aStructure);
    }

    @GetMapping("/set")
    public void set(
            @RequestParam(value = "id") int id,
            @RequestParam(value = "w", required = false) int w,
            @RequestParam(value = "al", required = false) int al,
            @RequestParam(value = "s-light", required = false) int sLight,
            @RequestParam(value = "s-heavy", required = false) int sHeavy,
            @RequestParam(value = "rc", required = false) int rc,
            @RequestParam(value = "src", required = false) int src,
            @RequestParam(value = "cft", required = false) int cft,
            @RequestParam(value = "cb", required = false) int cb,
            @RequestParam(value = "others", required = false) String others
    ) {
        Structure aStructure = new Structure(id, w, al, sLight, sHeavy, rc, src, cft, cb, others);
        service.update(aStructure);
    }

    @GetMapping("/remove")
    public void remove(@RequestParam(value = "id") int id) {
        service.delete(id);
    }

}
