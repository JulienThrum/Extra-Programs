import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class MTUSnowfall {

    public static void main(String[] args) {
        ArrayList<String> year = new ArrayList<>();
        ArrayList<String> oct = new ArrayList<>();
        ArrayList<String> nov = new ArrayList<>();
        ArrayList<String> dec = new ArrayList<>();
        ArrayList<String> jan = new ArrayList<>();
        ArrayList<String> feb = new ArrayList<>();
        ArrayList<String> mar = new ArrayList<>();
        ArrayList<String> apr = new ArrayList<>();
        ArrayList<String> may = new ArrayList<>();
        ArrayList<String> total = new ArrayList<>();

        String url = "https://www.mtu.edu/alumni/favorites/snowfall/";

        try {
            final Document document = Jsoup.connect(url).get();

            for(Element row : document.select("table.auto.striped tr")) {
                year.add(row.select("td:nth-of-type(1)").text());
                oct.add(row.select("td:nth-of-type(2)").text());
                nov.add(row.select("td:nth-of-type(3)").text());
                dec.add(row.select("td:nth-of-type(4)").text());
                jan.add(row.select("td:nth-of-type(5)").text());
                feb.add(row.select("td:nth-of-type(6)").text());
                mar.add(row.select("td:nth-of-type(7)").text());
                apr.add(row.select("td:nth-of-type(8)").text());
                may.add(row.select("td:nth-of-type(9)").text());
                total.add(row.select("td:nth-of-type(10)").text());
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.printf("%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\n", "YEAR", "OCT", "NOV", "DEC", "JAN", "FEB", "MAR", "APR", "MAY", "TOTAL");
        for(int i = 0; i < year.size(); i++) {
            System.out.printf("%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\n",
                    year.get(i),
                    oct.get(i),
                    nov.get(i),
                    dec.get(i),
                    jan.get(i),
                    feb.get(i),
                    mar.get(i),
                    apr.get(i),
                    may.get(i),
                    total.get(i));
        }
    }
}