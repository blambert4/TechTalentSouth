let userScore = 0
let compScore = 0

const userScore_span = document.getElementById("user-score");
const compScore_span = document.getElementById("comp-score");
const scoreBoard_div = document.querySelector(".scoreboard");
const result_p = document.querySelector(".result > p");
const rock_div = document.getElementById("r");
const paper_div = document.getElementById("p");
const scissors_div = document.getElementById("s");


function getComputerChoice() {
	const choices = ["r", "p", "s"];
	random_number = Math.floor(Math.random() * 3)
	return choices[random_number];
}

function convert(letter) {
	if (letter === "r") return "Rock";
	if (letter === "p") return "Paper";
	return "Scissors";
}

function wins(userChoice, computerChoice) {
	userScore ++
	userScore_span.innerHTML = userScore;
	compScore_span.innerHTML = compScore;
	const smallUserWord = "user".fontsize(3).sub();
	const smallCompWord = "comp".fontsize(3).sub();
	const userChoice_div = document.getElementById(userChoice)
	result_p.innerHTML = `${convert(userChoice)}${smallUserWord} beats ${convert(computerChoice)}${smallCompWord} you win!`;
	userChoice_div.classList.add("green-glow")
	setTimeout(function() {document.getElementById(userChoice).classList.remove("green-glow")}, 300)
}

function loses(userChoice, computerChoice) {
	compScore ++
	userScore_span.innerHTML = userScore;
	compScore_span.innerHTML = compScore;
	const smallUserWord = "user".fontsize(3).sub();
	const smallCompWord = "comp".fontsize(3).sub();
	const userChoice_div = document.getElementById(userChoice)
	result_p.innerHTML = `${convert(userChoice)}${smallUserWord} loses to ${convert(computerChoice)}${smallCompWord} you lost...`;
	userChoice_div.classList.add("red-glow")
	setTimeout(function() {document.getElementById(userChoice).classList.remove("red-glow")}, 300)

}
function draw(userChoice, computerChoice) {
	const smallUserWord = "user".fontsize(3).sub();
	const smallCompWord = "comp".fontsize(3).sub();
	const userChoice_div = document.getElementById(userChoice)
	result_p.innerHTML = `${convert(userChoice)}${smallUserWord} equals ${convert(computerChoice)}${smallCompWord} its a draw. `;
	userChoice_div.classList.add("yellow-glow")
	setTimeout(function() {document.getElementById(userChoice).classList.remove("yellow-glow")}, 300)

}

function game(userChoice) {
	const computerChoice = getComputerChoice();
	switch(userChoice + computerChoice) {
	case "rs":
	case "pr":
	case "sp":
		wins(userChoice,computerChoice);
		break;
	case "rp":
	case "ps":
	case "sr":
		loses(userChoice,computerChoice)
		break;
	case "rr":
	case "pp":
	case "ss":
		draw(userChoice,computerChoice);
		break;
	}
}


function main() {
rock_div.addEventListener('click', function() {
game("r")
})

paper_div.addEventListener('click', function() {
game("p")	
})

scissors_div.addEventListener('click', function() {
game("s")
})
}

main()