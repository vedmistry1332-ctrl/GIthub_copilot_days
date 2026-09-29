// Interactive glow effect for each card
document.querySelectorAll('.card').forEach(card => {
    card.addEventListener('mousemove', (e) => {
      const rect = card.getBoundingClientRect();
      const x = e.clientX - rect.left;
      const y = e.clientY - rect.top;
  
      card.style.boxShadow = `
        ${x / 10}px ${y / 10}px 30px rgba(255, 0, 255, 0.7),
        -${x / 10}px -${y / 10}px 30px rgba(0, 255, 255, 0.7)
      `;
    });
  
    card.addEventListener('mouseleave', () => {
      card.style.boxShadow = '0 0 20px #ff00ff';
    });
  });