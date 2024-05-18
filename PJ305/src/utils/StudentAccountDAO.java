package PJ305.src.utils;

import java.io.*;
import java.util.*;

import PJ305.src.model.StudentAccount;

public class StudentAccountDAO {
    public static List<StudentAccount> loadLIstFromFileChar(String fileName) {
        List<StudentAccount> res = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return res;

    }
}
