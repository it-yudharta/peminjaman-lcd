package it.yudharta.peminjamanlcd.controller;

import it.yudharta.peminjamanlcd.entity.Petugas;
import it.yudharta.peminjamanlcd.service.PetugasService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/petugas")
public class PetugasController {
    
    @Autowired
    private PetugasService br;

    @RequestMapping("list")
    public void daftarPetugas(ModelMap mm, Pageable page){
        Page<Petugas> data = br.findAll(page);        
        mm.addAttribute("daftarPetugas", data);        
    }
    
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public ModelMap tampilkanForm(@RequestParam(required = false) Integer id){
        ModelMap mm = new ModelMap();
        
        mm.addAttribute("petugas", new Petugas());
        
        if(id != null){
            Petugas b = br.findOne(id);
            if(b != null){
                mm.addAttribute("petugas", b);
            }
        }
        
        return mm;
    }
    
    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid Petugas b, BindingResult hasilValidasi){
        if(hasilValidasi.hasErrors()) {
            return "/petugas/form";
        }
        
        br.save(b);
        return "redirect:list";
    }
    
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String hapusPetugas(@RequestParam(required = true) Integer id){
        br.delete(id);
        return "redirect:list";
    }

}
