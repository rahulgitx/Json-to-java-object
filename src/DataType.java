public class DataType {
    public String dataType(String str){
        boolean dig = false, alphabets = false;
        Integer period = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c-'A' < 26 && c-'A' >= 0){
                alphabets = true;
            }
            if(c-'a' < 26 && c-'a' >=0){
                alphabets = true;
            }
            if(c-'0' >= 0 && c-'0' <9 ){
                dig = true;
            }
            if(c == '.'){
                period++;
            }
        }
        if(dig && period == 0) return "Integer";
        if(!alphabets && (dig && period == 1) ) return "float";
        return "String";

    }
}
