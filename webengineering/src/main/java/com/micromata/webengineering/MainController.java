package com.micromata.webengineering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;
import java.util.List;

/**
 * Main controller.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
@Controller
public class MainController {
  private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

  @RequestMapping("/")
  public ModelAndView index() {
    LOG.info("Request to /index");

    ModelAndView mav = new ModelAndView("index");

    List<Entry> list = new LinkedList<Entry>();
    for (long i = 0; i < 10; i++) {
      Entry entry = new Entry();
      entry.setVotes(i);
      entry.setTitle("Title:" + Long.toString(i));
      list.add(entry);
    }
    mav.addObject("list", list);

    return mav;
  }
}
