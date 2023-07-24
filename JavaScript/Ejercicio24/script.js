function submitQuiz() {
  var form = document.getElementById("quizForm");
  var totalQuestions = form.elements.length - 1; // Excluding the submit button
  var score = 0;

  for (var i = 0; i < totalQuestions; i++) {
    var question = form.elements["answer" + i];
    if (question.checked) {
      var userAnswer = question.value;
      var correctAnswer = getCorrectAnswer(i);
      var questionNumber = i + 1;

      var resultElement = document.getElementById("quizResult");
      resultElement.innerHTML += "<p>Pregunta " + questionNumber + ": " + getQuestion(i) + "</p>";

      if (userAnswer === correctAnswer) {
        resultElement.innerHTML += "<p>Tu respuesta: " + userAnswer + " <strong>(Correcto)</strong></p>";
        score++;
      } else {
        resultElement.innerHTML += "<p>Tu respuesta: " + userAnswer + " <strong>(Incorrecto)</strong></p>";
      }

      resultElement.innerHTML += "<p>Respuesta correcta: " + correctAnswer + "</p>";
      resultElement.innerHTML += "<hr>";
    }
  }

  var totalScoreElement = document.getElementById("results");
  totalScoreElement.style.display = "block";
  totalScoreElement.innerHTML = "<h2>Resultado del Quiz</h2>";
  totalScoreElement.innerHTML += "<p>Tu puntuación final es: " + score + " / " + totalQuestions + "</p>";
}

function getQuestion(index) {
  var questions = [
    "¿Cuál de las siguientes opciones no es un editor de código?",
    "¿Cuál es la capital de Francia?",
    "¿Cuál es el número pi?"
  ];
  return questions[index];
}

function getCorrectAnswer(index) {
  var correctAnswers = [
    "Word",
    "París",
    "3.14"
  ];
  return correctAnswers[index];
}