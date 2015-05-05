package OAuth;



public class VkAuth {
	// ссылка на страницу авторизации
	private String urlOAuth = "https://oauth.vk.com/authorize?";
	
	// ссылка на страницу получени токена
	private String urlOAuthToken = "https://oauth.vk.com/access_token?";
	
	// id приложения для доступа в VK
	private String client_id = "4904707";
	
	// https://oauth.vk.com/blank.html
	private String redirect_uri = "localhost:8080/WS1/result.do"; 
	
	// page — форма авторизации в отдельном окне
	// popup — всплывающее окно;
	// mobile — авторизация для мобильных устройств
	private String display = "page"; 
	
	// Битовая маска настроек доступа приложения 
	private String scope = "4457498"; 
		
	// Тип ответа, который Вы хотите получить:
	// code — если Вы хотите делать запросы со стороннего сервера (по умолчанию);
	// token — если Вы хотите делать запросы с клиента.
	private String response_type = "code"; 
	
	private String client_secret = "Y7mtpWaQPaa9WWhpZdP8";
	
	
	public String startOAuth() {
		StringBuilder  testResp = new StringBuilder();
		testResp.append(urlOAuth);
		testResp.append("client_id=" + client_id);
		testResp.append("&scope=" + scope);
		testResp.append("&redirect_uri=" + redirect_uri);
		testResp.append("&response_type=" + response_type);
		testResp.append("&v=5.30");
		testResp.append("&state=test");
//		testResp.append("&display=" + display);
		String result = testResp.toString();
	//	System.out.println(result);
		return result;
	}
	
	public String startOAuthToken(String code) {
		StringBuilder  testRespToken = new StringBuilder();
		testRespToken.append(urlOAuthToken);
		testRespToken.append("client_id=" + client_id);
		testRespToken.append("&client_secret=" + client_secret);
		testRespToken.append("&code=" + code);
		testRespToken.append("&redirect_uri=" + redirect_uri);
		String resultToken = testRespToken.toString();
		System.out.println(resultToken);
		return resultToken;
	}
	
	
}
