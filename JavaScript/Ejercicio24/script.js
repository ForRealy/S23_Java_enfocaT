var questions = [
    {
      question: "¿Cuál de las siguientes opciones no es un editor de código?",
      answers: [
        "vim",
        "vscode",
        "emacs",
        "Word"
      ],
      correctAnswer: "Word"
    },
    {
      question: "¿Cuál es la capital de Francia?",
      answers: [
        "París",
        "Londres",
        "Madrid",
        "Berlín"
      ],
      correctAnswer: "París"
    },
    {
      question: "¿Cuál es el número pi?",
      answers: [
        "3.14",
        "2.718",
        "1.618",
        "1.414"
      ],
      correctAnswer: "3.14"
    }
  ];
  
  var currentQuestion = 0;
  var correctAnswers = 0;
  
  function showQuestion() {
    var question = questions[currentQuestion];
    document.getElementById("question").innerHTML = question.question;
    for (var i = 0; i < question.answers.length; i++) {
      var answer = document.getElementById("answer" + i);
      answer.innerHTML = question.answers[i];
    }
  }
  
  function submitAnswer() {
    var answer = document.querySelector("input[name=answer]:checked");
    if (answer.value == questions[currentQuestion].correctAnswer) {
      correctAnswers++;
      alert("¡Correcto!");
    } else {
      alert("Incorrecto!");
    }
    currentQuestion++;
    if (currentQuestion < questions.length) {
      showQuestion();
    } else {
      displayResults();
    }
  }
  
  function displayResults() {
    var results = document.getElementById("results");
    results.innerHTML = "Tu puntuación es " + correctAnswers + " de " + questions.length;
  }
  
  showQuestion();
  