package api.quiz04;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiQuiz04Main {

	public static void main(String[] args) {
		String jsonString = "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"John Doe\",\r\n"
				+ "\"contacts\": [\r\n"
				+ "{\r\n"
				+ "\"type\": \"email\",\r\n"
				+ "\"value\": \"john.doe@example.com\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"type\": \"phone\",\r\n"
				+ "\"value\": \"01023456789\"\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"address\": {\r\n"
				+ "\"street\": \"123 Main Street\",\r\n"
				+ "\"city\": \"Seoul\",\r\n"
				+ "\"zipcode\": \"12345\"\r\n"
				+ "},\r\n"
				+ "\"orders\": [\r\n"
				+ "{\r\n"
				+ "\"orderId\": \"ORD-001\",\r\n"
				+ "\"date\": \"2024-07-09\",\r\n"
				+ "\"items\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"Smartphone\",\r\n"
				+ "\"quantity\": 2\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"name\": \"Laptop\",\r\n"
				+ "\"quantity\": 1\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"orderId\": \"ORD-002\",\r\n"
				+ "\"date\": \"2024-07-10\",\r\n"
				+ "\"items\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 3,\r\n"
				+ "\"name\": \"Headphones\",\r\n"
				+ "\"quantity\": 1\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
		
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonString);
			
			String id = jsonObject.get("id").toString();
			String name = jsonObject.get("name").toString();
			
			JSONArray contacts = (JSONArray)jsonObject.get("contacts");
			
			ArrayList<ContactDTO> contactList = new ArrayList<>();
			for(int i=0;i<contacts.size();i++) {
				JSONObject temp_obj = (JSONObject)contacts.get(i);
				String type = temp_obj.get("type").toString();
				String value = temp_obj.get("value").toString();
				
				ContactDTO temp_contact = new ContactDTO();
				temp_contact.setType(type);
				temp_contact.setValue(value);
				contactList.add(temp_contact);
			}
			JSONObject address = (JSONObject)jsonObject.get("address");
			String street = address.get("street").toString();
			String city = address.get("city").toString();
			String zipcode = address.get("zipcode").toString();
			
			AddressDTO addressDTO = new AddressDTO();
			addressDTO.setCity(city);
			addressDTO.setStreet(street);
			addressDTO.setZipcode(zipcode);
		
			JSONArray orders = (JSONArray)jsonObject.get("orders");
			ArrayList<OrdersDTO> ordersList = new ArrayList<>();
			for(int i=0;i<orders.size();i++) {
				JSONObject temp_orders = (JSONObject)orders.get(i);
				
				String orderId = temp_orders.get("orderId").toString();
				String date = temp_orders.get("date").toString();
				
				JSONArray items = (JSONArray)temp_orders.get("items");
				ArrayList<ItemsDTO> itemsList = new ArrayList<>();
				for(int j=0;j<items.size();j++) {
					JSONObject temp_item = (JSONObject)items.get(j);
					String item_id = temp_item.get("id").toString();
					String item_name = temp_item.get("name").toString();
					String item_quantity = temp_item.get("quantity").toString();
					
					ItemsDTO tempItem = new ItemsDTO();
					tempItem.id = Integer.parseInt(item_id);
					tempItem.name = item_name;
					tempItem.quantity = Integer.parseInt(item_quantity); 
					itemsList.add(tempItem);
				}
				
				OrdersDTO ordersDTO = new OrdersDTO();
				
				ordersDTO.setOrderId(orderId);
				ordersDTO.setDate(date);
				ordersDTO.setItems(itemsList);
				
				ordersList.add(ordersDTO);
			}	
			
			PersonDTO person = new PersonDTO();
			person.setId(Integer.parseInt(id));
			person.setName(name);
			person.setContacts(contactList);
			person.setAddress(addressDTO);
			person.setOrders(ordersList);
			
			System.out.println(person);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
