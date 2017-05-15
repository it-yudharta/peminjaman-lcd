package it.yudharta.peminjamanlcd.controller;

import it.yudharta.peminjamanlcd.entity.Peminjam;
import it.yudharta.peminjamanlcd.service.PeminjamService;
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
@RequestMapping("/peminjam")
public class PeminjamController {
    
    @Autowired
    private PeminjamService br;

    @RequestMapping("list")
    public void daftarPeminjam(ModelMap mm, Pageable page){
        Page<Peminjam> data = br.findAll(page);        
        mm.addAttribute("daftarPeminjam", data);        
    }
    
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public ModelMap tampilkanForm(@RequestParam(required = false) Integer id){
        ModelMap mm = new ModelMap();
        
        mm.addAttribute("peminjam", new Peminjam());
        
        if(id != null){
            Peminjam b = br.findOne(id);
            if(b != null){
                mm.addAttribute("peminjam", b);
            }
        }
        
        return mm;
    }
    
    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid Peminjam b, BindingResult hasilValidasi){
        if(hasilValidasi.hasErrors()) {
            return "/peminjam/form";
        }
        
        br.save(b);
        return "redirect:list";
    }
    
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String hapusPeminjam(@RequestParam(required = true) Integer id){
        br.delete(id);
        return "redirect:list";
    }

}
