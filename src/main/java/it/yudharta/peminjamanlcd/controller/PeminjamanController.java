package it.yudharta.peminjamanlcd.controller;

import it.yudharta.peminjamanlcd.entity.Peminjaman;
import it.yudharta.peminjamanlcd.service.PeminjamanService;
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
@RequestMapping("/peminjaman")
public class PeminjamanController {
    
    @Autowired
    private PeminjamanService br;

    @RequestMapping("list")
    public void daftarPeminjaman(ModelMap mm, Pageable page){
        Page<Peminjaman> data = br.findAll(page);        
        mm.addAttribute("daftarPeminjaman", data);        
    }
    
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public ModelMap tampilkanForm(@RequestParam(required = false) Integer id){
        ModelMap mm = new ModelMap();
        
        mm.addAttribute("peminjaman", new Peminjaman());
        
        if(id != null){
            Peminjaman b = br.findOne(id);
            if(b != null){
                mm.addAttribute("peminjaman", b);
            }
        }
        
        return mm;
    }
    
    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid Peminjaman b, BindingResult hasilValidasi){
        if(hasilValidasi.hasErrors()) {
            return "/peminjaman/form";
        }
        
        br.save(b);
        return "redirect:list";
    }
    
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String hapusPeminjaman(@RequestParam(required = true) Integer id){
        br.delete(id);
        return "redirect:list";
    }

}
