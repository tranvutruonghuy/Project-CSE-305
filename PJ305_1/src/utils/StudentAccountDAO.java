package utils;

import java.io.*;
import java.util.*;

import model.*;

public class StudentAccountDAO {
    public static List<StudentAccount> loadLIstFromFileChar(String fileName) {
        List<StudentAccount> res = new ArrayList<>();
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(fileName));
        String line = "";

    }
}