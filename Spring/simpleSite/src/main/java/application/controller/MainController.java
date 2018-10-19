package application.controller;

import application.model.Article;

import application.service.ArticleServise;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

@Controller
@RequestMapping("/blog")
public class MainController {

//    @Autowired
//    private ArticleServise servise;

    @Autowired
    private ArticleServise servise;

    @RequestMapping
    public String mainPage(Model model){
        model.addAttribute("message", "Ну заходи, раз пришёл");
        return "main";
    }

    @RequestMapping(value = "/editor")
    public String editorPage(Model model){
        model.addAttribute("article", new Article());
        return "editor";
    }

    @RequestMapping(value = "/editor/submit", method = RequestMethod.POST)
    public String submitArticle(@ModelAttribute Article article){
        servise.save(article);
        return "redirect:../";
    }

}
