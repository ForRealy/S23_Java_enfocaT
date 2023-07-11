//jQuery
$(document).ready(function () {
    $("#toggleRed").click(function () {
        $("#paragraph").toggleClass("red");
    });
});
//JavaScript
const toggleBlueBtn = document.getElementById("toggleBlue");
const paragraph = document.getElementById("paragraph");

toggleBlueBtn.addEventListener("click", function () {
    paragraph.classList.toggle("blue");
});
