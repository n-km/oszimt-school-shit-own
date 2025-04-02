document.addEventListener("DOMContentLoaded", () => {
    const questionEl = document.getElementById("question");
    const answerEl = document.getElementById("answer");
    const feedbackEl = document.getElementById("feedback");
    const submitBtn = document.getElementById("submit-btn");
    const nextBtn = document.getElementById("next-btn");
    let currentAnswer = "";

    function generateTask() {
        feedbackEl.textContent = "";
        answerEl.value = "";
        answerEl.disabled = false;
        submitBtn.style.display = "inline-block";
        nextBtn.style.display = "none";

        const typ = Math.floor(Math.random() * 4);
        let qText = "";
        switch (typ) {
            case 0: {
                // Hex in Binär
                const num = Math.floor(Math.random() * 256);
                const hex = num.toString(16).toUpperCase();
                const bin = num.toString(2).padStart(8, "0");
                qText = `Rechne HEX ${hex} in BINÄR um:`;
                currentAnswer = bin;
                break;
            }
            case 1: {
                // Binär in Hexadezimal
                const num = Math.floor(Math.random() * 256);
                const bin = num.toString(2).padStart(8, "0");
                const hex = num.toString(16).toUpperCase();
                qText = `Rechne BINÄR ${bin} in HEXADEZIMAL um:`;
                currentAnswer = hex;
                break;
            }
            case 2: {
                // Dezimal in Hexadezimal
                const num = Math.floor(Math.random() * 256);
                const hex = num.toString(16).toUpperCase();
                qText = `Rechne DEZIMAL ${num} in HEXADEZIMAL um:`;
                currentAnswer = hex;
                break;
            }
            case 3: {
                // Hex in Dezimal
                const num = Math.floor(Math.random() * 256);
                const hex = num.toString(16).toUpperCase();
                const dez = num.toString(10);
                qText = `Rechne HEX ${hex} in DEZIMAL um:`;
                currentAnswer = dez;
                break;
            }
        }
        questionEl.textContent = qText;
    }

    function checkAnswer() {
        const userAnswer = answerEl.value.trim();
        if (userAnswer === currentAnswer) {
            feedbackEl.textContent = "✅ Richtig!";
        } else {
            feedbackEl.textContent = `❌ Falsch! Korrekte Antwort: ${currentAnswer}`;
        }
        answerEl.disabled = true;
        submitBtn.style.display = "none";
        nextBtn.style.display = "inline-block";
    }

    submitBtn.addEventListener("click", checkAnswer);
    nextBtn.addEventListener("click", generateTask);

    generateTask();
});