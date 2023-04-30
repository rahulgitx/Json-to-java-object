public class DataType {
    public String dataType(String str){
        boolean dig = false, alphabets = false, period = false;
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
                period = true;
            }
        }
        if(alphabets || (period && !dig)){
            return "String";
        }
        if(period && dig){
            return "float";
        }
        return "Integer";

    }
}
