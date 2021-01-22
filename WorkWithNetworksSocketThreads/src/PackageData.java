import java.io.Serializable;
import java.util.*;
public class PackageData implements Serializable{
    ArrayList<String> names;

    public PackageData(ArrayList<String> names){
        this.names = names;
    }
}