package task015;

import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zamkovoyilya on 27/03/16.
 */
@org.springframework.stereotype.Controller
@RequestMapping("/hi")
public class First {

    @RequestMapping(method = RequestMethod.GET)
    public String hiPage(ModelMap model, @RequestParam(required = false) String example_text, @RequestParam(required = false) String url) {

        Pattern pMath = Pattern.compile("/getdate");
        Matcher m1 = pMath.matcher(example_text);

        if(m1.find()){
            Date date = new Date();
            model.put(String.valueOf(date), url);
        }
        Pattern pAction = Pattern.compile("/(add|mult)/[0-9]+/[0-9]+");
        Matcher m2 = pAction.matcher(example_text);
        if (m2.find()){
            String [] arr = example_text.split("/");

            int a = Integer.parseInt(arr[2]);
            int b = Integer.parseInt(arr[3]);

            if(arr[1].equals("add")){
                int sum = a+b;
                model.put(String.valueOf(sum), url);
            }
            else{
                int mult = a*b;
                model.put(String.valueOf(mult), url);
            }
            Pattern pSearch = Pattern.compile("/(baidu.com|bing.com| yahoo.com|aol.com)/search");
            Matcher m3 = pSearch.matcher(example_text);
            if(m3.find()){
                String [] arr1 = example_text.split("/");

                if(arr1[1].equals("baidu.com")){
                    model.put("https://baidu.com", url);
                }
                if(arr1[1].equals("bing.com")){
                    model.put("https://bing.com", url);
                }
                if(arr1[1].equals("yahoo.com")){
                    model.put("https://yahoo.com", url);
                }
                if(arr1[1].equals("aol.com")){
                    model.put("https://aol.com", url);
                }

            }
        }
        return "hi";
    }

}
