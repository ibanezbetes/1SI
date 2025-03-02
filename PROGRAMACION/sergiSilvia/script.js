audioElement.play();

function spinWheel() {
    // Deshabilitar el botón para evitar múltiples clics
    document.getElementById("spinButton").disabled = true;
  
    const wheel = document.getElementById("wheel");
    // 5 vueltas completas + 30° = 1830°, apuntando al sector de "Regalo Sorpresa"
    wheel.style.transform = "rotate(1830deg)";
  
    // Al terminar la animación, mostramos el resultado
    wheel.addEventListener("transitionend", showResult, { once: true });
  }
  
  function showResult() {
    // Mantenemos la ruleta visible
    // Ocultamos el botón de girar
    document.getElementById("spinButton").style.display = "none";
  
    // Mostramos el mensaje de resultado
    document.getElementById("resultSection").classList.remove("hidden");
  }
  
  function openGift() {
    // Ocultamos el mensaje de resultado y mostramos el contenido del regalo
    document.getElementById("resultSection").classList.add("hidden");
    document.getElementById("giftContent").classList.remove("hidden");
  }
  