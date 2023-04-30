public class NewString {
    public String getString(String line){
        String newLine, key="", value="";
        boolean keyFlag = false, valueFlag = false;
        int i = 0, count = 0;
        for(i=0; i<line.length(); i++){
            if(line.charAt(i) == '"') count++;
            if(count == 1) {
                keyFlag = true;
                if(line.charAt(i+1) != '"') key += line.charAt(i+1);
            }
            if(count == 2) keyFlag = false;
            if(count == 3){
                valueFlag = true;
                if(line.charAt(i+1) != '"') value += line.charAt(i+1);
            }
//                System.out.println(line.charAt(i));
        }
        DataType dataType = new DataType();
        String dtype = dataType.dataType(value);
        newLine = "Private "+ dtype + " " + key + ";";
        return newLine;
    }
}
