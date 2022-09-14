<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.6.1.min.js"
            integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>

    <script>
        const getSectionPage = (url, data, loadId, error = function () {
        }) => {
            $.ajax({
                type: "GET",
                url,
                data,
                success: (res) => {
                    $('#' + loadId).html(res);
                },
                error: (err) => {
                    console.error(err);
                    error();
                }
            });

        }

        const loadProfile = (id = 0) => {
            getSectionPage("/main/profile.do", {id}, "profile");
        }

        const loadProfileAll = () => {
            getSectionPage("/main/profileAll.do", {} , "profile");
        }


        const init = () => {
            $("#click").click((e) => {
                loadProfile($("#id").val());
                $("#id").val("");
            })

            $("#findAll").click((e) => {
                loadProfileAll();
            })
        }

        $(document).ready(function () {
            init();
        });
    </script>
</head>
<body>
<header>
    <div>
        <label for="id">아이디</label><input id="id">
        <button id="click">검색</button>
        <button id="findAll">전체검색</button>
    </div>

</header>
<section>
    <article id="profile">
    </article>
</section>
</body>

<script>

</script>
</html>
