// src/main/resources/static/js/app.js

document.addEventListener("DOMContentLoaded", function () {
    console.log("앱이 성공적으로 로드되었습니다!");

    // 예시: 버튼 클릭 이벤트 처리
    const buttons = document.querySelectorAll("button");
    buttons.forEach(button => {
        button.addEventListener("click", function () {
            alert("버튼이 클릭되었습니다!");
        });
    });
});
