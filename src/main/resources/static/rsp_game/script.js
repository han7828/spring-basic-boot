
let rsp = document.querySelector("#form");
rsp.addEventListener('click', async (e) => {

    let img = e.target.childNodes[1].alt;
    console.log(img);
})