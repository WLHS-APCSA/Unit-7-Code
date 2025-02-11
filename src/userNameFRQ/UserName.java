package userNameFRQ;

import java.util.Arrays;
import java.util.ArrayList;

public class UserName{
    private ArrayList<String> possibleNames;
    private String[] usedNames;

    public UserName(String firstName, String lastName){
        possibleNames = new ArrayList<String>();
        String possibleName = lastName;
        for(int i = 0; i < firstName.length();i++){
            possibleName += firstName.substring(i,i+1);
            possibleNames.add(possibleName);
        }
    }

    public UserName(String firstName, String lastName,String[] used){
        this.usedNames = used;
        possibleNames = new ArrayList<String>();
        String possibleName = lastName;
        for(int i = 0; i < firstName.length();i++){
            possibleName += firstName.substring(i,i+1);
            possibleNames.add(possibleName);
        }
    }

    public boolean isUsed(String name, String[] arr){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, name) >= 0;
    }

    public void setAvailableUserNames(String[] usedNames){
        for(int i = 0; i<possibleNames.size(); i++){
            String name = possibleNames.get(i);
            if(isUsed(name,usedNames)){
                possibleNames.remove(i);
                i--;
            }
        }
    }

    public void setUsedNames(String[] usedNames){
        this.usedNames = usedNames;
    }

    public String toString(){
        String nameList = "";
        for(String name:possibleNames){
            nameList += name+"\n";
        }
        return nameList;
    }

}


