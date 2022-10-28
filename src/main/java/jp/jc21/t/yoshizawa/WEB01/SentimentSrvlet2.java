package jp.jc21.t.yoshizawa.WEB01;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/sentiment")
public class SentimentSrvlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SentimentSrvlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String string = "Stepover Toehold With Facelock";
		try {
			SLanguage result = Sentiment.getSentiment(string);
			SconfidenceScores message = result.documents[0].confidenceScores;
			float negative= message.negative;
			float neutral=  message.neutral;
			float positive= message.positive;
			request.setAttribute("message", message);
			request.setAttribute("negative", negative);
			request.setAttribute("neutral", neutral);
			request.setAttribute("positive", positive);
			request.getRequestDispatcher("/WEB-INF/sentiment.jsp").forward(request, response);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String string = request.getParameter("string");
		request.setAttribute("string", string);

		try {
			SLanguage result = Sentiment.getSentiment(string);
			SconfidenceScores message = result.documents[0].confidenceScores;
			float negative= message.negative;
			float neutral=  message.neutral;
			float positive= message.positive;
			request.setAttribute("message", message);
			request.setAttribute("negative", negative);
			request.setAttribute("neutral", neutral);
			request.setAttribute("positive", positive);
			request.getRequestDispatcher("/WEB-INF/jsp/sentiment.jsp").forward(request, response);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
