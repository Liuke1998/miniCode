package miniCode;

import java.util.ArrayList;

public class Demo {
    public static void textInputAll(String s){
        ArrayList<String> list = new ArrayList<String>();
        textOutPutAll(s, list);
    }

    public static void textOutPutAll(String s, ArrayList<String> list){
        int len = s.length();
        if(len == 0){
            //可以通过日志打印出来结果
            System.out.println(list);
            return;
        }
        for(int i=1; i<=len; i++){
            String str = s.substring(0, i);
            if(dataDictionary(str)){
                list.add(str);
                textOutPutAll(s.substring(i), list);
                list.remove(list.size()-1);
            }
        }
    }

    private static boolean dataDictionary(String str){
        String[] dict = DictionaryData.getInstance().getDict();
        for(int i=0; i<dict.length; i++){
            if(dict[i].equals(str)){
                return true;
            }
        }
        return false;
    }
}
