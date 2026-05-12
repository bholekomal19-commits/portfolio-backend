package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.Entity.Product;
import com.tka.Service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    // ✅ Show all products
    @GetMapping
    public String getAllProducts(Model model) {
        List<Product> list = service.getAllProducts();   // ✅ FIXED
        model.addAttribute("products", list);
        return "allProducts";   // JSP name
    }

    // ✅ Open Add Product page
    @GetMapping("/add")
    public String addPage() {
        return "add-Products";
    }

    // ✅ Save Product
    
    @PostMapping("/save")
    public String saveProduct(Product p) {
        service.save(p);
        return "redirect:/products";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
        return "redirect:/products";
    }
    
    @GetMapping("/search")
    public String searchProducts(@RequestParam String keyword, Model model) {

        List<Product> list = service.searchProducts(keyword);

        model.addAttribute("products", list);
        return "allProducts"; // same page reuse
    }
    
    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, Model model) {

        Product product = service.getProductById(id);
        model.addAttribute("product", product);

        return "edit_product"; // JSP file name
    }
    
    @PostMapping("/update")
    public String updateProduct(@ModelAttribute Product product) {

        service.saveProduct(product);
        return "redirect:/products";
    }
}