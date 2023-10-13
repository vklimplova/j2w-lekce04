[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include '/_common/head.ftlh']
</head>
<body>

<div class="container">
    [#include '/_common/header.ftlh']

    [#list ucastnici]
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col"></th>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col">Bydliště</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#items as ucastnik]
            <tr>
                [#-- counter počítá od 1, index od 0 --]
                <td>${ucastnik?counter}</td>
                [#--<td><i class="las la-mars" style="color: blue;"></i></td> --]
                <td>${ucastnik.jmeno}</td>
                <td>${ucastnik.prijmeni}</td>
                <td>${ucastnik.bydliste}</td>
                <td><a href="/ucastnici/detail/${ucastnik?index}" class="btn btn-primary">Detail</a></td>
            </tr>
        [/#items]
        </tbody>
    </table>
    [#else]
        <div>
            <em>Seznam účastníků je prázdný.</em>
        </div>
    [/#list]
</div>
</body>
</html>
