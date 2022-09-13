/*Ese Codigo Fue Elaborado Por Sanchez Cano Alejandro, visita  mi portafolio Aquí :D

https://alejandrotrikitrakatelas33sanchezcano.github.io/Mi-Portafolio33/

33
*/


//Convertir a Binario

var convertirBinario = numero=>{
    var binarioArray = []
    while(numero > 1){
        binarioArray.push(numero % 2);
        numero = Math.floor(numero / 2);
    }
    binarioArray.push(numero);
    return parseInt(binarioArray.reverse().join(""));
};
console.log(convertirBinario(255));

//Funcion de Calcular

function calcular(){


    //Declaración De IP
    let primerParametroIP = parseInt(document.getElementById("Primer_Parametro").value);
    let segundoParametroIP = parseInt(document.getElementById("Segundo_Parametro").value);
    let tercerParametroIP = parseInt(document.getElementById("Tecer_Parametro").value);
    let cuartoParametroIP = parseInt(document.getElementById("Cuarto_Parametro").value);
    
    var ip = [primerParametroIP, segundoParametroIP, tercerParametroIP, cuartoParametroIP];

    //Clase Que es:
    let clase = ""; 

    //Mascara De SubRed

    var mascaraSubRed = [];
    var mascaraSubRedBINARIO = [];

    //Subredes

    let Subredes = parseInt(document.getElementById("Subred_Parametro").value);

    //Potencias Base 2

    var potenciaBase2 = [1,2,4,8,16,32,64,128];

    //CHECA QUE CLASE ES:

    if(primerParametroIP <= 127 ){
        clase = "A";
    }else if (primerParametroIP <= 191 ){
        clase = "B";
    }else{
        clase = "C";
    }

    
    //CHECA QUE MASCARA DE SUBRED ES:

    if(clase === "A"){

        var mascaraSubRed = [255,0,0,0]
        document.getElementById("Mascara_Parametro").value = mascaraSubRed[0] + "." + mascaraSubRed[1] + "." + mascaraSubRed[2] + "." + mascaraSubRed[3];

    }else if(clase === "B"){

        var mascaraSubRed = [255,255,0,0]
        document.getElementById("Mascara_Parametro").value = mascaraSubRed[0] + "." + mascaraSubRed[1] + "." + mascaraSubRed[2] + "." + mascaraSubRed[3];

    }else if(clase === "C"){

        var mascaraSubRed = [255,255,255,0]
        document.getElementById("Mascara_Parametro").value = mascaraSubRed[0] + "." + mascaraSubRed[1] + "." + mascaraSubRed[2] + "." + mascaraSubRed[3];

    }
    
    //CHECA LOS BITS QUE TIENE QUE ROBAR

    if(Subredes === potenciaBase2[0]){
        var numeroBits = 0;
    }else if (Subredes === potenciaBase2[1]){
        var numeroBits = 1;
    }else if (Subredes <= potenciaBase2[2]){
        var numeroBits = 2;
    }else if (Subredes <= potenciaBase2[3]){
        var numeroBits = 3;
    }else if (Subredes <= potenciaBase2[4]){
        var numeroBits = 4;
    }else if (Subredes <= potenciaBase2[5]){
        var numeroBits = 5;
    }else if (Subredes <= potenciaBase2[6]){
        var numeroBits = 6;
    }else if (Subredes <= potenciaBase2[7]){
        var numeroBits = 7;
    }
    
    //Convertimos a Binario La Mascara de SubRed

    if(clase === "A"){
        mascaraSubRedBINARIO = [convertirBinario(mascaraSubRed[0]), convertirBinario(mascaraSubRed[1]) + convertirBinario(potenciaBase2[numeroBits]), convertirBinario(mascaraSubRed[2]), convertirBinario(mascaraSubRed[4])]
    }else if(clase === "B"){
        mascaraSubRedBINARIO = [convertirBinario(mascaraSubRed[0]), convertirBinario(mascaraSubRed[1]), convertirBinario(mascaraSubRed[2]) + convertirBinario(potenciaBase2[numeroBits]), convertirBinario(mascaraSubRed[4])]
    }else if(clase === "C"){
        mascaraSubRedBINARIO = [convertirBinario(mascaraSubRed[0]), convertirBinario(mascaraSubRed[1]), convertirBinario(mascaraSubRed[2]), convertirBinario(mascaraSubRed[4])  + convertirBinario(potenciaBase2[numeroBits])];
    }

    console.log(ip);
    console.log(mascaraSubRed);
    console.log(clase);
    console.log(numeroBits)
    console.log(mascaraSubRedBINARIO);
}
    

//Funcion de Convertir a Binario

function binario(){
    

    let primerParametroIP = parseInt(document.getElementById("Primer_Parametro").value);
    let segundoParametroIP = parseInt(document.getElementById("Segundo_Parametro").value);
    let tercerParametroIP = parseInt(document.getElementById("Tecer_Parametro").value);
    let cuartoParametroIP = parseInt(document.getElementById("Cuarto_Parametro").value);
    
    var ip = [primerParametroIP, segundoParametroIP, tercerParametroIP, cuartoParametroIP];

    //Clase Que es:
    let clase = ""; 


    //Mascara De SubRed

    
    var mascaraSubRed = [];

    //CHECA QUE CLASE ES:

    if(primerParametroIP <= 127 ){
        clase = "A";
    }else if (primerParametroIP <= 191 ){
        clase = "B";
    }else{
        clase = "C";
    }

    
    //CHECA QUE MASCARA DE SUBRED ES:

    if(clase === "A"){

        var mascaraSubRed = [255,0,0,0]

    }else if(clase === "B"){

        var mascaraSubRed = [255,255,0,0]

    }else if(clase === "C"){

        var mascaraSubRed = [255,255,255,0]

    }

    //Mascara de Sub Red

    document.getElementById("Mascara_Parametro").value = convertirBinario(mascaraSubRed[0]) + "." + convertirBinario(mascaraSubRed[1]) + "." + convertirBinario(mascaraSubRed[2]) + "." + convertirBinario(mascaraSubRed[3])
}



