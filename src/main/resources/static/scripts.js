// document.addEventListener('DOMContentLoaded', function() {
//     const addUserButton = document.getElementById('addUserButton');
//
//     addUserButton.addEventListener('click', function() {
//         const username = document.getElementById('username').value.trim();
//         const surname = document.getElementById('surname').value.trim();
//         const login = document.getElementById('login').value.trim();
//         const password = document.getElementById('password').value.trim();
//
//         if (username === '' || surname === '' || login === '' || password === '') {
//             alert('Пожалуйста, заполните все поля.');
//             return;
//         }
//
//         const userData = {
//             username: username,
//             surname: surname,
//             login: login,
//             password: password
//         };password
//
//         fetch('/admin/addUser', {
//             method: 'POST',
//             headers: {
//                 'Content-Type': 'application/json'
//             },
//             body: JSON.stringify(userData)
//         })
//             .then(response => response.json())
//             .then(data => {
//                 if (data.success) {
//                     alert('Пользователь успешно добавлен!');
//                     document.getElementById('username').value = '';
//                     document.getElementById('surname').value = '';
//                     document.getElementById('login').value = '';
//                     document.getElementById('password').value = '';
//                 } else {
//                     alert('Ошибка добавления пользователя: ' + data.message);
//                 }
//             })
//             .catch(error => {
//                 console.error('Ошибка:', error);
//                 alert('Произошла ошибка при отправке данных на сервер.');
//             });
//     });
// });

// $("#addUserButton").click(function() {
//     $.post('/admin/addUser', function(response) {
//         // Здесь обрабатываем полученный ответ
//     });
// });