package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DictionaryService;
import service.DictionaryServiceImpl;

@Controller
public class DictionaryController {

  private DictionaryService dictionaryService = new DictionaryServiceImpl();

  @PostMapping("/result")
  public ModelAndView resultSearch(@RequestParam String english){
    ModelAndView modelAndView = new ModelAndView("/dictionary");
    modelAndView.addObject("english", english);
    String result = this.dictionaryService.wordSearch(english);
    if(result == null){
      modelAndView.addObject("result", "Not found");
    } else {
      modelAndView.addObject("english", english);
      modelAndView.addObject("result", result);
    }
    return modelAndView;
  }



  @GetMapping("/")
  public String showDictionary(){
    return "dictionary";
  }
}
