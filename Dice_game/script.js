let playerRolls = [0, 0, 0, 0];

function rollSingleDice(playerNumber) {
  const diceImg = document.getElementById("dice" + playerNumber);

  // Animate spin
  diceImg.style.transform = "rotate(" + (Math.random() * 720) + "deg)";

  // Delay to simulate rolling
  setTimeout(() => {
    const roll = Math.floor(Math.random() * 6) + 1;
    diceImg.src = "images/dice" + roll + ".png";
    diceImg.style.transform = "rotate(0deg)";
    playerRolls[playerNumber - 1] = roll;
  }, 300);
}

function checkWinner() {
  if (playerRolls.includes(0)) {
    document.getElementById("result").textContent = "All players must roll before checking winner!";
    return;
  }

  // Clear previous winner highlight
  for (let i = 1; i <= 4; i++) {
    document.getElementById("dice" + i).parentElement.classList.remove("winner");
  }

  const max = Math.max(...playerRolls);
  const winners = playerRolls
    .map((val, idx) => (val === max ? idx + 1 : null))
    .filter(Boolean);

  winners.forEach(winner => {
    document.getElementById("dice" + winner).parentElement.classList.add("winner");
  });

  const losers = playerRolls
    .map((val, idx) => (val !== max ? idx + 1 : null))
    .filter(Boolean);

  const resultText = winners.length === 1
    ? `🏆 Player ${winners[0]} Wins!`
    : `🤝 It's a draw between players: ${winners.join(', ')}`;

  const loserText = losers.length > 0 ? ` 😞 Losers: ${losers.join(', ')}` : "";

  document.getElementById("result").textContent = resultText + loserText;
}

function newRound() {
  for (let i = 1; i <= 4; i++) {
    document.getElementById("dice" + i).src = "images/dice1.png";
    document.getElementById("dice" + i).parentElement.classList.remove("winner");
  }

  document.getElementById("result").textContent = "";
  playerRolls = [0, 0, 0, 0];
}
