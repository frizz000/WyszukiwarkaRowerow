package pjwstk.pl.wyszukiwarkarowerow;

import com.google.gson.Gson;
import jakarta.persistence.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pjwstk.pl.wyszukiwarkarowerow.dto.BikeDTO;
import pjwstk.pl.wyszukiwarkarowerow.model.Bike;
import pjwstk.pl.wyszukiwarkarowerow.model.Company;
import pjwstk.pl.wyszukiwarkarowerow.model.User;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "bikeServlet", value = "/bike-servlet")
public class BikeServlet extends HttpServlet {
    private Gson gson = new Gson();
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    public void init() {
        emf = Persistence.createEntityManagerFactory("TPOWyszukiwarkaRowerow");
        em = emf.createEntityManager();

        em.getTransaction().begin();

        // ========================Users============================

        // ========================Companies========================

        Company company1 = new Company();
        company1.setName("Commencal");
        company1.setCountry("Andora");
        company1.setContact("contact@commencal.com");
        em.persist(company1);

        Company company2 = new Company();
        company2.setName("Santa Cruz");
        company2.setCountry("USA");
        company2.setContact("info@santa.com");
        em.persist(company2);

        Company company3 = new Company();
        company3.setName("Trek");
        company3.setCountry("USA");
        company3.setContact("trek@info.eu");
        em.persist(company3);

        User user1 = new User();
        user1.setName("Jan");
        user1.setSurname("Kowalski");
        user1.setEmail("efds.rfr@pl.pl");
        user1.setPhoneNumber("123456789");
        em.persist(user1);

        User user2 = new User();
        user2.setName("Adam");
        user2.setSurname("Nowak");
        user2.setEmail("nowak.elo@uyyt.pl");
        user2.setPhoneNumber("123456789");
        em.persist(user2);

        User user3 = new User();
        user3.setName("Kamil");
        user3.setSurname("Kowalski");
        user3.setEmail("kamil@onet.pl");
        user3.setPhoneNumber("123456789");
        em.persist(user3);

        User user4 = new User();
        user4.setName("Dawid");
        user4.setSurname("Madej");
        user4.setEmail("dawid.madej@pl.pl");
        user4.setPhoneNumber("123456789");
        em.persist(user4);

        User user5 = new User();
        user5.setName("Kuba");
        user5.setSurname("Kowalski");
        user5.setEmail("kowalski.kuba@pl.pl");
        user5.setPhoneNumber("123456789");
        em.persist(user5);

        // ========================Commencal========================

        Bike bike1 = new Bike();
        bike1.setModelName("V4.2");
        bike1.setType("Downhill");
        bike1.setCompany(company1);
        bike1.setOwner(user1);
        bike1.setImageUrl("https://i.imgur.com/JslWgzD.jpg");
        bike1.setSize("M");
        bike1.setPrice(16000.0);
        bike1.setWeight(14.0);
        bike1.setEquipment("Shimano brakes, Maxxis tires, Rockshox suspension");
        bike1.setDescription("Great mountain bike for intermediate riders.");
        em.persist(bike1);

        Bike bike3 = new Bike();
        bike3.setModelName("Meta AM 29");
        bike3.setType("Enduro");
        bike3.setCompany(company1);
        bike3.setOwner(user2);
        bike3.setImageUrl("https://i.imgur.com/RVxEGnr.jpg");
        bike3.setSize("L");
        bike3.setPrice(20000.0);
        bike3.setWeight(15.2);
        bike3.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike3.setDescription("Perfect bike for enduro. Great for downhill.");
        em.persist(bike3);

        // ========================Santa Cruz========================

        Bike bike2 = new Bike();
        bike2.setModelName("Megatower");
        bike2.setType("Enduro");
        bike2.setCompany(company2);
        bike2.setOwner(user3);
        bike2.setImageUrl("https://i.imgur.com/9mZXRzB.jpg");
        bike2.setSize("L");
        bike2.setPrice(25000.0);
        bike2.setWeight(15.0);
        bike2.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike2.setDescription("Perfect bike for downhill.");
        em.persist(bike2);

        Bike bike4 = new Bike();
        bike4.setModelName("Nomad");
        bike4.setType("Enduro");
        bike4.setCompany(company2);
        bike4.setOwner(user4);
        bike4.setImageUrl("https://i.imgur.com/HYX0g4V.jpg");
        bike4.setSize("M");
        bike4.setPrice(30000.0);
        bike4.setWeight(14.5);
        bike4.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike4.setDescription("Perfect bike for downhill.");
        em.persist(bike4);

        Bike bike5 = new Bike();
        bike5.setModelName("V 10");
        bike5.setType("Downhill");
        bike5.setCompany(company2);
        bike5.setOwner(user5);
        bike5.setImageUrl("https://i.imgur.com/iJpu2S9.jpg");
        bike5.setSize("L");
        bike5.setPrice(35000.0);
        bike5.setWeight(14.5);
        bike5.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike5.setDescription("Perfect bike for downhill.");
        em.persist(bike5);

        Bike bike6 = new Bike();
        bike6.setModelName("Bronson");
        bike6.setType("Trial");
        bike6.setCompany(company2);
        bike6.setOwner(user1);
        bike6.setImageUrl("https://i.imgur.com/OiTRkIn.jpg");
        bike6.setSize("M");
        bike6.setPrice(20000.0);
        bike6.setWeight(14.5);
        bike6.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike6.setDescription("Perfect bike for downhill.");
        em.persist(bike6);

        // ========================Trek========================

        Bike bike7 = new Bike();
        bike7.setModelName("Slash");
        bike7.setType("Enduro");
        bike7.setCompany(company3);
        bike7.setOwner(user2);
        bike7.setImageUrl("https://i.imgur.com/E1v2afk.png");
        bike7.setSize("L");
        bike7.setPrice(25000.0);
        bike7.setWeight(15.0);
        bike7.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike7.setDescription("Perfect bike for downhill.");
        em.persist(bike7);

        Bike bike8 = new Bike();
        bike8.setModelName("Remedy");
        bike8.setType("Enduro");
        bike8.setCompany(company3);
        bike8.setOwner(user3);
        bike8.setImageUrl("https://i.imgur.com/5o004tP.jpg");
        bike8.setSize("L");
        bike8.setPrice(25000.0);
        bike8.setWeight(15.0);
        bike8.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike8.setDescription("Perfect bike for downhill.");
        em.persist(bike8);

        Bike bike9 = new Bike();
        bike9.setModelName("Session");
        bike9.setType("Downhill");
        bike9.setCompany(company3);
        bike9.setOwner(user4);
        bike9.setImageUrl("https://i.imgur.com/uJC266h.jpg");
        bike9.setSize("L");
        bike9.setPrice(25000.0);
        bike9.setWeight(15.0);
        bike9.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike9.setDescription("Perfect bike for downhill.");
        em.persist(bike9);

        Bike bike10 = new Bike();
        bike10.setModelName("Madone");
        bike10.setType("Road");
        bike10.setCompany(company3);
        bike10.setOwner(user5);
        bike10.setImageUrl("https://i.imgur.com/sZJs59c.png");
        bike10.setSize("L");
        bike10.setPrice(25000.0);
        bike10.setWeight(15.0);
        bike10.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike10.setDescription("Perfect bike for downhill.");
        em.persist(bike10);

        Bike bike11 = new Bike();
        bike11.setModelName("Domane");
        bike11.setType("Road");
        bike11.setCompany(company3);
        bike11.setOwner(user1);
        bike11.setImageUrl("https://i.imgur.com/Z5cA6Ej.jpg");
        bike11.setSize("L");
        bike11.setPrice(25000.0);
        bike11.setWeight(15.0);
        bike11.setEquipment("Carbon frame, Reflective tires, Comfortable saddle");
        bike11.setDescription("Perfect bike for downhill.");
        em.persist(bike11);

        em.getTransaction().commit();
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String modelName = request.getParameter("modelName");
        String companyName = request.getParameter("companyName");
        String type = request.getParameter("type");
        String size = request.getParameter("size");
        String ownerName = request.getParameter("ownerName");
        String ownerSurname = request.getParameter("ownerSurname");

        TypedQuery<Bike> query = em.createQuery("SELECT b FROM Bike b WHERE b.modelName LIKE :modelName AND b.company.name LIKE :companyName AND b.type LIKE :type AND b.size LIKE :size AND b.owner.name LIKE :ownerName AND b.owner.surname LIKE :ownerSurname", Bike.class);
        query.setParameter("modelName", "%" + modelName + "%");
        query.setParameter("companyName", "%" + companyName + "%");
        query.setParameter("type", "%" + type + "%");
        query.setParameter("size", "%" + size + "%");
        query.setParameter("ownerName", "%" + ownerName + "%");
        query.setParameter("ownerSurname", "%" + ownerSurname + "%");

        List<Bike> bikes = query.getResultList();

        List<BikeDTO> bikesDTO = bikes.stream().map(BikeDTO::new).toList();

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(this.gson.toJson(bikesDTO));
    }


    public void destroy() {
        em.close();
        emf.close();
    }
}
