package com.micromata.webengineering;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main controller.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
@Controller
public class MainController {
  @RequestMapping("/")
  public String index() {
    return "index";
  }
}
