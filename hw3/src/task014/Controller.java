package task014;

import org.springframework.ui.ModelMap;

/**
 * Created by zamkovoyilya on 27/03/16.
 */
@org.springframework.stereotype.Controller
@RequestMapping("/hi")
public class Controller {

    @RequestMapping(method = RequestMethod.GET)
    public String hiPage(ModelMap model, @RequestParam(required = false) String text, @RequestParam(required = false) String attribute, @RequestParam(required = false) String n) {
        if(attribute.equals("number of characters")){
            int k = text.length();
            model.put(String.valueOf(k), n);
        }
        if(attribute.equals("number of words")){
            int k = text.length();
            model.put(String.valueOf(k), n);
        }
        if(attribute.equals("number of sentences")){
            int k = text.length();
            model.put(String.valueOf(k), n);
        }
        if(attribute.equals("number of paragraphs")){
            int k = text.length();
            model.put(String.valueOf(k), n);
        }

        return "hi";
    }
}
