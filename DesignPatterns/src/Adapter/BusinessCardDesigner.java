package Adapter;

//Client class which requires Customer interface
public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += customer.getFullName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }

}
