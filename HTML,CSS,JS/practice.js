const planets = document.querySelectorAll('.planet');
const planet_radii = [40];
let planet_radians = new Array(1).fill(0);
const planet_velocities = [1.5];

setInterval(()=>{
    let i;
    for(i=0;i<planets.length();i++){
        planets[i].style.left=Math.cos(planet_radians[i]) * planet_radii[i];
        planets[i].style.top=Math.sin(planet_radians[i]) * planet_radii[i];
        planet_radians[i]+=planet_velocities[i]*0.02;
    }
},1)