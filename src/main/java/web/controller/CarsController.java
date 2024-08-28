package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String printCars(ModelMap model, HttpServletRequest request) {

        String strCount = request.getParameter("count");
        Integer count = strCount == null ? -1 : Integer.valueOf(strCount);

        CarService carService = new CarServiceImpl();

        model.addAttribute("carsList", carService.getCars(count));
        /*o
        CarServiceImpl carService = new CarServiceImpl();
        ArrayList<Car> allCars = (ArrayList<Car>) carService.getCars(0);
        model.addAttribute("allCars", allCars);
        return "cars";
         */

        return "cars";
    }
}
