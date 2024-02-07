let container = document.querySelector('#todos');
const API_URL = '/api/todos'
let TODO_URL = '';

async function todos(){
    let res = await fetch(API_URL);
    let data = await res.json();

    let idx = 0;
    for(let i in data){
        let todos = '';
        if ( !data[idx].done ) {
            todos = `<li>${data[idx].content}<input type="hidden" value="${data[idx].id}"></li>`;
        } else {
            todos = `<li class="completed">${data[idx].content}<input type="hidden" value="${data[idx].id}"></li>`;
        }
        container.innerHTML += todos;
        idx++;
    }
}
todos();
form.addEventListener('submit', async (e) => {
    e.preventDefault();
    let input = document.querySelector('#input');
    if ( input.value != '') {
        let resInput = await fetch(API_URL, {
            method: "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify({
                id: null,
                content: input.value,
                done: false,
            })
        });
        let addData = await resInput.json();
        if (addData != false) {
            location.href = "/todos";
        }
    }
})

let target = document.querySelector("ul");
target.addEventListener('click', async (e) => {
    e.target.classList.toggle("completed");
    let inputValue = e.target.childNodes[1].value;

    await fetch(`api/todos/${inputValue}`, {
        method : 'PUT'
    })
})
target.addEventListener('contextmenu', async (e) => {
    e.preventDefault();
    let inputValue = e.target.childNodes[1].value;

    await fetch(`api/todos/${inputValue}`, {
        method: 'DELETE'
    })
    alert("삭제되었습니다.");
    location.href = 'todos';
})