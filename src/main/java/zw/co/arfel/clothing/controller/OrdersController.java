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
import zw.co.arfel.clothing.model.Orders;
import zw.co.arfel.clothing.service.OrdersService;

import javax.annotation.Resource;


/**
 * Created by ezinzombe on 7/14/17.
 */
@Controller
@RequestMapping("/order")
public class OrdersController {

@Resource
    private OrdersService orderService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam(required = false) Long id, Model model) {
        final Orders order;
        if (id != null) {
            order = orderService.findOne(id).get();
        } else {
            order = new Orders();
        }
        model.addAttribute("order", order);
        return "/order/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("order") @Validated Orders order,
                       BindingResult result, Model model,
                       final RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {

            return "/order/add";
        } else {
            redirectAttributes.addFlashAttribute("css", "success");
            if (order.isNew()) {
                redirectAttributes.addFlashAttribute("msg", "Orders added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Orders updated successfully!");
            }
            orderService.save(order);
            return "/order/list";
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("orders", orderService.findAll());
        return "/order/list";
    }
}
