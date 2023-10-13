[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include '/_common/head.ftlh']
</head>
<body>

<div class="container">
    [#include '/_common/header.ftlh']
 [#list lekce]
    <table class="table">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Název lekce</th>
            <th scope="col">Datum</th>
            <th scope="col">Čas</th>
            <th scope="col">Místo</th>
        </tr>
        </thead>
        <tbody>
        [#items as lekce]
        <tr>
            <td>${lekce?counter}</td>
            <td>${lekce.nazevLekce}</td>
            <td>${lekce.datum}</td>
            <td>${lekce.cas}</td>
            <td><a href="/lekce/detail/${lekce?index}" class="btn btn-primary">Detail</a></td>
        </tr>
        [/#items]
        </tbody>
    </table>
</div>
</body>
[/#list]
</html>
