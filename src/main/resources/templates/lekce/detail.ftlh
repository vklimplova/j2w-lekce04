[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include '/_common/head.ftlh']
</head>
<body>


<div class="container">
    [#include '/_common/header.ftlh']

    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">${lekce.nazevLekce}</h5>
            <p class="card-text">Místo konání: ${lekce.mistoKonani}</p>
        </div>
    </div>
</div>

</body>
</html>