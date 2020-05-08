<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Encrypt</title>
</head>
<body>
    <h1>Encrypt</h1>
    <p><a href="/"><button type="button">Back</button></a></p>
    <hr/>
    <h2>DES: </h2>
    <h3>Upload file here: </h3>
    <form enctype="multipart/form-data" method="post" action="/encrypt/des">
        <h5>Target file: </h5>
        <input type="file" name="file">
        <h5>Key file: </h5>
        <input type="file" name="key">
        <button type="submit">Upload</button>
    </form>
    <hr/>
    <h2>RSA: </h2>
    <h3>Upload file here: </h3>
    <form enctype="multipart/form-data" method="post" action="/encrypt/rsa">
        <h5>Target file: </h5>
        <input type="file" name="file">
        <h5>Public key file: </h5>
        <input type="file" name="key">
        <button type="submit">Upload</button>
    </form>
    <hr/>
    <h2>AUTO: </h2>
    <h3>Upload file here: </h3>
    <form enctype="multipart/form-data" method="post" action="/encrypt/auto">
        <h5>Target file: </h5>
        <input type="file" name="file">
        <button type="submit">Upload</button>
    </form>
</body>
</html>