package zw.co.arfel.clothing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import zw.co.arfel.clothing.model.Advert;
import zw.co.arfel.clothing.model.AdvertCategory;
import zw.co.arfel.clothing.service.AdvertService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.nio.file.Path;
import java.util.List;


/**
 * Created by ezinzombe on 7/14/17.
 */
@Controller
@RequestMapping("/advert")
public class AdvertController {

    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "/home/ezinzombe/uploads/";

    @Resource
    private AdvertService advertService;

    private Path path;

    private void populateDefaultModel(Model model) {

        model.addAttribute("advertCategoryTypeList", AdvertCategory.values());

    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam(required = false) Long id, Model model) {
        final Advert advert;
        if (id != null) {
            advert = advertService.findOne(id).get();
        } else {
            advert = new Advert();
        }
        model.addAttribute("advert", advert);
        populateDefaultModel(model);
        return "/advert/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("advert") @Validated Advert advert,
                       BindingResult result, Model model,
                       final RedirectAttributes redirectAttributes, HttpServletRequest request) {
        if (result.hasErrors()) {
            populateDefaultModel(model);

            return "/advert/add";
        } else {
            redirectAttributes.addFlashAttribute("css", "success");
            if (advert.isNew()) {
                redirectAttributes.addFlashAttribute("msg", "Advert added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Advert updated successfully!");
            }
            advertService.save(advert);
            return "redirect:advert/upload";
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {

        List<Advert> adverts =advertService.findAll().get();

        model.addAttribute("adverts", adverts);
        System.out.println("+++++++++++++++++++++++++++++"+adverts);

        return "/advert/list";
    }
}
