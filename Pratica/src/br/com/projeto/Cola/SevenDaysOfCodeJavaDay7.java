package br.com.projeto.Cola;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.AbstractDocument.Content;

public class SevenDaysOfCodeJavaDay7 {

	public static void main(String[] args) throws Exception {

	

				String apiKey = "k_5ao0c510";
				URI apiIMDB = URI.create("https://imdb-api.com/en/API/Top250TVs/" + apiKey);
				
				HttpClient client = HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder().uri(apiIMDB).build();

				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
				String json = response.body();

				String[] moviesArray = parseJsonMovies(json);

				List<String> titles = parseTitles(moviesArray);
				titles.forEach(System.out::println);

				List<String> urlImages = parseUrlImages(moviesArray);
				urlImages.forEach(System.out::println);
				
				//outras listas para rating e years
			}

			private static String[] parseJsonMovies(String json) {
				Matcher matcher = Pattern.compile(".*\\[(.*)\\].*").matcher(json);

				if (!matcher.matches()) {
					throw new IllegalArgumentException("no match in " + json);
				}

				String[] moviesArray = matcher.group(1).split("\\},\\{");
				moviesArray[0] = moviesArray[0].substring(1);
				int last = moviesArray.length - 1;
				String lastString = moviesArray[last];
				moviesArray[last] = lastString.substring(0, lastString.length() - 1);
				return moviesArray;
			}
			
			private static List<String> parseTitles(String[] moviesArray) {
				return parseAttribute(moviesArray, 3);
			}
			
			private static List<String> parseUrlImages(String[] moviesArray) {
				return parseAttribute(moviesArray, 5);
			}
			
			private static List<String> parseAttribute(String[] moviesArray, int pos) {
				return Stream.of(moviesArray)
					.map(e -> e.split("\",\"")[pos]) 
					.map(e -> e.split(":\"")[1]) 
					.map(e -> e.replaceAll("\"", ""))
					.collect(Collectors.toList());
			}
		}
//ImdbApiClient implementando a nova interface

class ImdbApiClient implements ApiClient{

	private String apiKey;

	public ImdbApiClient(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getBody() {

		try {
			URI apiIMDB = URI.create("https://imdb-api.com/en/API/Top250TVs/" + this.apiKey);

			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder().uri(apiIMDB).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			
			return response.body();
		} catch (IOException e) {
			throw new IllegalStateException(e);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}

}

//------------------------------------------------------------
//Gerador de HTML, agora recebendo uma List<? extends Content>

class HtmlGenerator {

	private final PrintWriter writer;

	public HtmlGenerator(PrintWriter writer) {
		this.writer = writer;
	}

	public void generate(List<? extends Content> contentList) {
		writer.println(
	"""
	<html>
		<head>
			<meta charset=\"utf-8\">
			<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">
			<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" 
						+ "integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">
						
		</head>
		<body>
	""");

		for (Content content : contentList) {
			String div =
			"""
			<div class=\"card text-white bg-dark mb-3\" style=\"max-width: 18rem;\">
				<h4 class=\"card-header\">%s</h4>
				<div class=\"card-body\">
					<img class=\"card-img\" src=\"%s\" alt=\"%s\">
					<p class=\"card-text mt-2\">Nota: %s - Ano: %s</p>
				</div>
			</div>
			""";
			
			writer.println(String.format(div, content.title(), content.urlImage(), content.title(), content.rating(), content.year()));
		}
				
		writer.println(
		"""
			</body>
		</html>
		""");
	}

}