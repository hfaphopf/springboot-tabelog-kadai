
package com.example.nagoyameshi.controller;

import java.util.Locale.Category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.nagoyameshi.repository.CategoryRepository;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/admin/categories")
public class AdminCategoryController {
	private final CategoryRepository categoryRepository;

	public AdminCategoryController(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@GetMapping
	public String index(@RequestParam(name = "keyword", required = false) String keyword,
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable,
			Model model) {
		Page<Category> categoryPage;

		if (keyword != null && !keyword.isEmpty()) {
			categoryPage = categoryRepository.findByNameLikeOrFuriganaLike("%" + keyword + "%", "%" + keyword + "%",
					pageable);
		} else {
			categoryPage = categoryRepository.findAll(pageable);
		}

		model.addAttribute("categoryPage", categoryPage);
		model.addAttribute("keyword", keyword);

		return "admin/categories/index";
	}
}
