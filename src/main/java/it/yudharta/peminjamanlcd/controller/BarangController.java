package it.yudharta.peminjamanlcd.controller;

import it.yudharta.peminjamanlcd.entity.Barang;
import it.yudharta.peminjamanlcd.service.BarangService;
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
@RequestMapping("/barang")
public class BarangController {
    
    @Autowired
    private BarangService br;

    @RequestMapping("list")
    public void daftarBarang(ModelMap mm, Pageable page){
        Page<Barang> data = br.findAll(page);        
        mm.addAttribute("daftarBarang", data);        
    }
    
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public ModelMap tampilkanForm(@RequestParam(required = false) Integer id){
        ModelMap mm = new ModelMap();
        
        mm.addAttribute("barang", new Barang());
        
        if(id != null){
            Barang b = br.findOne(id);
            if(b != null){
                mm.addAttribute("barang", b);
            }
        }
        
        return mm;
    }
    
    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid Barang b, BindingResult hasilValidasi){
        if(hasilValidasi.hasErrors()) {
            return "/barang/form";
        }
        
        br.save(b);
        return "redirect:list";
    }
    
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String hapusBarang(@RequestParam(required = true) Integer id){
        br.delete(id);
        return "redirect:list";
    }

}
