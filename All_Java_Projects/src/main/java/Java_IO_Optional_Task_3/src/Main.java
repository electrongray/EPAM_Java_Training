package Java_IO_Optional_Task_3.src;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            while (strLine != null) {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine == null)
                    break;
                list.add(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

        BufferedReader br = null;
        String strLine1 = "";
        try {
            LineNumberReader reader = null;
            try {
                reader = new LineNumberReader(new InputStreamReader
                        (new FileInputStream("file.txt"), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    if (!(((strLine1 = reader.readLine()) != null)
                            && reader.getLineNumber() <= 62)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String word = strLine1.toString();
                word = word.trim();
                String result = "";
                char[] ch = word.toCharArray();
                for (int i = ch.length - 1; i >= 0; i--) {
                    result += ch[i];
                }
                System.out.println(result.trim());
                String[]  my_array = new String[] {"{ niaM ssalc cilbup",
                        "{ )sgra ][gnirtS(niam diov citats cilbup",
                        ";\"321\" = 1n gnirtS",  ";\"654\" = 2n gnirtS",
                        "};))2n ,1n(sgnirtSdda + \" = \" + \"'\" + 2n + \"'\" + " +
                                "\" + \" + \"'\" + 1n + \"'\"(nltnirp.tuo.metsyS",
                        "{ )2n gnirtS ,1n gnirtS(sgnirtSdda gnirtS citats cilbup",
                        ";)1n(mun_rts = x ][tni",";)2n(mun_rts = y ][tni",
                        ";]1 + )htgnel.y ,htgnel.x(xam.htaM[tni wen = mus ][tni",
                        ";0 = z tni",";1 - htgnel.mus = xedni tni",";0 = i tni",
                        ";0 = j tni","{ )0 => xedni( elihw","{ )htgnel.x < i( fi",
                        "};]++i[x =+ z","{ )htgnel.y < j( fi","};]++j[y =+ z",
                        ";01 % z = ]--xedni[mus","};01 =/ z",
                        ";)htgnel.mus(redliuBgnirtS wen = bs redliuBgnirtS",
                        "{ )i++ ;htgnel.mus < i ;)0 : 1 ? 0 == ]0[mus( = i( rof",
                        "};)]i[mus(dneppa.bs","};)(gnirtSot.bs nruter",
                        "{ )mun gnirtS(mun_rts ][tni citats cilbup",
                        ";)(yarrArahCot.mun = stigid ][rahc",
                        ";]htgnel.stigid[tni wen = rebmun ][tni",
                        ";1 - htgnel.rebmun = xedni tni",
                        "{ )stigid :tigid rahc( rof",
                        "};'0' - tigid = ]--xedni[rebmun","}};rebmun nruter"};

                ArrayList<String>  list1 = new ArrayList<String>(Arrays.asList(my_array));

                String filename = "file1.txt";
                FileWriter fw = null;
                try {
                    fw = new FileWriter(filename, false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //appends the string to the file
                try {
                    fw.write(String.valueOf(new ArrayList(list1)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } finally {

        }
    }
}