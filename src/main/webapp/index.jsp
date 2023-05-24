<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Wyszukiwarka rowerów</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script src="script.js"></script>
</head>
<body>
<h1>Wyszukiwarka rowerów</h1>
<form id="searchForm">
    <input name="modelName" placeholder="Nazwa modelu"/>
    <input name="companyName" placeholder="Nazwa firmy"/>
    <input name="ownerName" placeholder="Imię właściciela"/>
    <input name="ownerSurname" placeholder="Nazwisko właściciela"/>

    <label for="type">Typ roweru:</label>
    <select name="type" id="type">
        <option value="">Wszystkie</option>
        <option value="Trial">Trialowy</option>
        <option value="Enduro">Enduro</option>
        <option value="Downhill">Downhillowy</option>
        <option value="Road">Szosowy</option>
    </select>
    <label for="size">Rozmiar ramy:</label>
    <select name="size" id="size">
        <option value="">Wszystkie</option>
        <option value="XS">XS</option>
        <option value="S">S</option>
        <option value="M">M</option>
        <option value="L">L</option>
        <option value="XL">XL</option>
    </select>

    <%--<label for="minPrice">Cena minimalna:</label>
    <input type="number" id="minPrice" name="minPrice" placeholder="Cena minimalna"/>

    <label for="maxPrice">Cena maksymalna:</label>
    <input type="number" id="maxPrice" name="maxPrice" placeholder="Cena maksymalna" value="1000000"/>--%>

    <button type="submit">Szukaj</button>
</form>
<div id="results"></div>
</body>
</html>
