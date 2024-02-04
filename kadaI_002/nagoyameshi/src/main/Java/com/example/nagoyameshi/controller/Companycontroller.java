package com.example.nagoyameshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.nagoyameshi.form.CompanyEditForm;
import com.example.nagoyameshi.security.UserDetailsImpl;

@Controller
public class Companycontroller {
	
	@GetMapping("/company")
    public String company() {
    return "admin/company/CompanyPage";
    }

	@GetMapping("/companyedit")
	public String edit(@AuthenticationPrincipal UserDetailsImpl userDetailsImpl, Model model) {        
	    User user = userRepository.getReferenceById(userDetailsImpl.getUser().getId());  
	    CompanyEditForm companyEditForm = new CompanyEditForm(user.getCompanyName(), user.getLocation(), user.getRepresentativeName(), user.getEstablishmentDate(), user.getCapital(), user.getPhoneNumber(), user.getBusinessContent());
	    model.addAttribute("companyEditForm", companyEditForm);
	    
	    return "user/companyedit";
	}
	
	@PostMapping("/companyedit")
	public String companyEdit(@ModelAttribute CompanyEditForm companyEditForm) {
	    // 会社情報の編集処理
	    
	    return "redirect:/company"; // 編集後に会社情報ページにリダイレクト
	}
}
