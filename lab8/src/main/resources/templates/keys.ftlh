<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Keys</title>
</head>
<body>
    <h1>Choose option</h1>
    <p><a href="/"><button type="button">Back</button></a></p>
    <form method="post" action="/keys/des">
        <input style="margin-bottom: 15px" type="submit" value="Get DES Keys">
    </form>
    <form method="post" action="/keys/rsa">
        <input style="margin-bottom: 15px" type="submit" value="Get RSA Keys">
    </form>
</body>
</html>