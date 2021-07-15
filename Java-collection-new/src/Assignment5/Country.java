package Assignment5;

//        Develop a java class with a instance variable Country  HashSet (H1)  add a method saveCountryNames(String CountryName) ,
//        the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
//        Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.
//        NOTE: You can test the methods using a main method.


import java.util.HashSet;
import java.util.Iterator;

public class Country {

    public HashSet<String> countryNames = new HashSet<>();


    public HashSet<String> saveCountryNames(String countryName)
    {
        countryNames.add(countryName);
        return  countryNames;
    }

    public String getCountryName(String countryName)
    {
        Iterator<String> it = countryNames.iterator();

        while(it.hasNext())
        {
            if(it.next().equals(countryName))
            {
                return countryName;
            }
        }

        return null;

    }


    public static  void  main(String[] args)
    {

        Country country = new Country();
        country.saveCountryNames("INDIA");
        country.saveCountryNames("BHARAT");
        country.saveCountryNames("HINDUSTAN");

        System.out.println(country.getCountryName("INDIA"));
        System.out.println(country.getCountryName("USA"));





    }
}
