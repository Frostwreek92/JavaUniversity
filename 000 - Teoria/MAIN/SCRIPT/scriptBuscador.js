const input = document.getElementById("buscador");
const contenedor = document.getElementById("contenedor");
const sections = document.querySelectorAll("#seccion");
const borrar = document.getElementById("borrar");

input.addEventListener("input", () => {
    const value = input.value.trim().toLowerCase();

    sections.forEach(el => {
        const text = el.querySelector("a").innerText.toLowerCase();

        if (text.includes(value)) {
            el.style.display = "block";
        } else {
            el.style.display = "none";
        }
    });
});

borrar.addEventListener("click", () => {
    input.value = ""; // Borra el contenido del buscador
    sections.forEach(el => el.style.display = "block"); // Muestra todos los elementos
});